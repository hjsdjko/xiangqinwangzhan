
package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.XiangqinEntity;
import com.entity.XiangqinLiuyanEntity;
import com.entity.YonghuEntity;
import com.entity.view.XiangqinLiuyanView;
import com.service.*;
import com.utils.PageUtils;
import com.utils.PoiUtil;
import com.utils.R;
import com.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.URL;
import java.util.*;

/**
 * 相亲留言
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xiangqinLiuyan")
public class XiangqinLiuyanController {
    private static final Logger logger = LoggerFactory.getLogger(XiangqinLiuyanController.class);

    @Autowired
    private XiangqinLiuyanService xiangqinLiuyanService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private XiangqinService xiangqinService;
    @Autowired
    private YonghuService yonghuService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = xiangqinLiuyanService.queryPage(params);

        //字典表数据转换
        List<XiangqinLiuyanView> list =(List<XiangqinLiuyanView>)page.getList();
        for(XiangqinLiuyanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XiangqinLiuyanEntity xiangqinLiuyan = xiangqinLiuyanService.selectById(id);
        if(xiangqinLiuyan !=null){
            //entity转view
            XiangqinLiuyanView view = new XiangqinLiuyanView();
            BeanUtils.copyProperties( xiangqinLiuyan , view );//把实体数据重构到view中

                //级联表
                XiangqinEntity xiangqin = xiangqinService.selectById(xiangqinLiuyan.getXiangqinId());
                if(xiangqin != null){
                    BeanUtils.copyProperties( xiangqin , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setXiangqinId(xiangqin.getId());
                    view.setXiangqinYonghuId(xiangqin.getYonghuId());
                }
                //级联表
                YonghuEntity yonghu = yonghuService.selectById(xiangqinLiuyan.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody XiangqinLiuyanEntity xiangqinLiuyan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xiangqinLiuyan:{}",this.getClass().getName(),xiangqinLiuyan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            xiangqinLiuyan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        xiangqinLiuyan.setInsertTime(new Date());
        xiangqinLiuyan.setCreateTime(new Date());
        xiangqinLiuyanService.insert(xiangqinLiuyan);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XiangqinLiuyanEntity xiangqinLiuyan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,xiangqinLiuyan:{}",this.getClass().getName(),xiangqinLiuyan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            xiangqinLiuyan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<XiangqinLiuyanEntity> queryWrapper = new EntityWrapper<XiangqinLiuyanEntity>()
            .eq("id",0)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XiangqinLiuyanEntity xiangqinLiuyanEntity = xiangqinLiuyanService.selectOne(queryWrapper);
        xiangqinLiuyan.setUpdateTime(new Date());
        if(xiangqinLiuyanEntity==null){
            xiangqinLiuyanService.updateById(xiangqinLiuyan);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        xiangqinLiuyanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save(String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<XiangqinLiuyanEntity> xiangqinLiuyanList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            XiangqinLiuyanEntity xiangqinLiuyanEntity = new XiangqinLiuyanEntity();
//                            xiangqinLiuyanEntity.setXiangqinId(Integer.valueOf(data.get(0)));   //相亲 要改的
//                            xiangqinLiuyanEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            xiangqinLiuyanEntity.setXiangqinLiuyanText(data.get(0));                    //留言内容 要改的
//                            xiangqinLiuyanEntity.setReplyText(data.get(0));                    //回复内容 要改的
//                            xiangqinLiuyanEntity.setInsertTime(date);//时间
//                            xiangqinLiuyanEntity.setUpdateTime(new Date(data.get(0)));          //回复时间 要改的
//                            xiangqinLiuyanEntity.setCreateTime(date);//时间
                            xiangqinLiuyanList.add(xiangqinLiuyanEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        xiangqinLiuyanService.insertBatch(xiangqinLiuyanList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = xiangqinLiuyanService.queryPage(params);

        //字典表数据转换
        List<XiangqinLiuyanView> list =(List<XiangqinLiuyanView>)page.getList();
        for(XiangqinLiuyanView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XiangqinLiuyanEntity xiangqinLiuyan = xiangqinLiuyanService.selectById(id);
            if(xiangqinLiuyan !=null){


                //entity转view
                XiangqinLiuyanView view = new XiangqinLiuyanView();
                BeanUtils.copyProperties( xiangqinLiuyan , view );//把实体数据重构到view中

                //级联表
                    XiangqinEntity xiangqin = xiangqinService.selectById(xiangqinLiuyan.getXiangqinId());
                if(xiangqin != null){
                    BeanUtils.copyProperties( xiangqin , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setXiangqinId(xiangqin.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(xiangqinLiuyan.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody XiangqinLiuyanEntity xiangqinLiuyan, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,xiangqinLiuyan:{}",this.getClass().getName(),xiangqinLiuyan.toString());
        xiangqinLiuyan.setInsertTime(new Date());
        xiangqinLiuyan.setCreateTime(new Date());
        xiangqinLiuyanService.insert(xiangqinLiuyan);
        return R.ok();
        }


}

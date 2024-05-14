
package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.XiangqinEntity;
import com.entity.YonghuEntity;
import com.entity.view.XiangqinView;
import com.service.DictionaryService;
import com.service.TokenService;
import com.service.XiangqinService;
import com.service.YonghuService;
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
 * 相亲
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xiangqin")
public class XiangqinController {
    private static final Logger logger = LoggerFactory.getLogger(XiangqinController.class);

    @Autowired
    private XiangqinService xiangqinService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
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
        PageUtils page = xiangqinService.queryPage(params);

        //字典表数据转换
        List<XiangqinView> list =(List<XiangqinView>)page.getList();
        for(XiangqinView c:list){
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
        XiangqinEntity xiangqin = xiangqinService.selectById(id);
        if(xiangqin !=null){
            //entity转view
            XiangqinView view = new XiangqinView();
            BeanUtils.copyProperties( xiangqin , view );//把实体数据重构到view中

                //级联表
                YonghuEntity yonghu = yonghuService.selectById(xiangqin.getYonghuId());
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
    public R save(@RequestBody XiangqinEntity xiangqin, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xiangqin:{}",this.getClass().getName(),xiangqin.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            xiangqin.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<XiangqinEntity> queryWrapper = new EntityWrapper<XiangqinEntity>()
            .eq("yonghu_id", xiangqin.getYonghuId())
            .eq("xiangqin_name", xiangqin.getXiangqinName())
            .eq("sex_types", xiangqin.getSexTypes())
            .eq("shuxiang", xiangqin.getShuxiang())
            .eq("youwuzinv", xiangqin.getYouwuzinv())
            .eq("xuexing", xiangqin.getXuexing())
            .eq("tizhong", xiangqin.getTizhong())
            .eq("zhiye", xiangqin.getZhiye())
            .eq("gongsixingzhi", xiangqin.getGongsixingzhi())
            .eq("yuexin", xiangqin.getYuexin())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XiangqinEntity xiangqinEntity = xiangqinService.selectOne(queryWrapper);
        if(xiangqinEntity==null){
            xiangqin.setInsertTime(new Date());
            xiangqin.setCreateTime(new Date());
            xiangqinService.insert(xiangqin);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XiangqinEntity xiangqin, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,xiangqin:{}",this.getClass().getName(),xiangqin.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            xiangqin.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<XiangqinEntity> queryWrapper = new EntityWrapper<XiangqinEntity>()
            .notIn("id",xiangqin.getId())
            .andNew()
            .eq("yonghu_id", xiangqin.getYonghuId())
            .eq("xiangqin_name", xiangqin.getXiangqinName())
            .eq("sex_types", xiangqin.getSexTypes())
            .eq("shuxiang", xiangqin.getShuxiang())
            .eq("youwuzinv", xiangqin.getYouwuzinv())
            .eq("xuexing", xiangqin.getXuexing())
            .eq("tizhong", xiangqin.getTizhong())
            .eq("zhiye", xiangqin.getZhiye())
            .eq("gongsixingzhi", xiangqin.getGongsixingzhi())
            .eq("yuexin", xiangqin.getYuexin())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XiangqinEntity xiangqinEntity = xiangqinService.selectOne(queryWrapper);
        if("".equals(xiangqin.getXiangqinPhoto()) || "null".equals(xiangqin.getXiangqinPhoto())){
                xiangqin.setXiangqinPhoto(null);
        }
        if(xiangqinEntity==null){
            xiangqinService.updateById(xiangqin);//根据id更新
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
        xiangqinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save(String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<XiangqinEntity> xiangqinList = new ArrayList<>();//上传的东西
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
                            XiangqinEntity xiangqinEntity = new XiangqinEntity();
//                            xiangqinEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            xiangqinEntity.setXiangqinName(data.get(0));                    //姓名 要改的
//                            xiangqinEntity.setSexTypes(Integer.valueOf(data.get(0)));   //性别 要改的
//                            xiangqinEntity.setXiangqinPhoto("");//照片
//                            xiangqinEntity.setShuxiang(data.get(0));                    //属相 要改的
//                            xiangqinEntity.setYouwuzinv(data.get(0));                    //有无子女 要改的
//                            xiangqinEntity.setXuexing(data.get(0));                    //血型 要改的
//                            xiangqinEntity.setTizhong(Integer.valueOf(data.get(0)));   //体重(kg) 要改的
//                            xiangqinEntity.setZhiye(data.get(0));                    //职业 要改的
//                            xiangqinEntity.setGongsixingzhi(data.get(0));                    //公司性质 要改的
//                            xiangqinEntity.setYuexin(data.get(0));                    //月薪 要改的
//                            xiangqinEntity.setGerenContent("");//照片
//                            xiangqinEntity.setGongzuoContent("");//照片
//                            xiangqinEntity.setJiatingContent("");//照片
//                            xiangqinEntity.setZeouContent("");//照片
//                            xiangqinEntity.setInsertTime(date);//时间
//                            xiangqinEntity.setCreateTime(date);//时间
                            xiangqinList.add(xiangqinEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        xiangqinService.insertBatch(xiangqinList);
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
        PageUtils page = xiangqinService.queryPage(params);

        //字典表数据转换
        List<XiangqinView> list =(List<XiangqinView>)page.getList();
        for(XiangqinView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XiangqinEntity xiangqin = xiangqinService.selectById(id);
            if(xiangqin !=null){


                //entity转view
                XiangqinView view = new XiangqinView();
                BeanUtils.copyProperties( xiangqin , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(xiangqin.getYonghuId());
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
    public R add(@RequestBody XiangqinEntity xiangqin, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,xiangqin:{}",this.getClass().getName(),xiangqin.toString());
        Wrapper<XiangqinEntity> queryWrapper = new EntityWrapper<XiangqinEntity>()
            .eq("yonghu_id", xiangqin.getYonghuId())
            .eq("xiangqin_name", xiangqin.getXiangqinName())
            .eq("sex_types", xiangqin.getSexTypes())
            .eq("shuxiang", xiangqin.getShuxiang())
            .eq("youwuzinv", xiangqin.getYouwuzinv())
            .eq("xuexing", xiangqin.getXuexing())
            .eq("tizhong", xiangqin.getTizhong())
            .eq("zhiye", xiangqin.getZhiye())
            .eq("gongsixingzhi", xiangqin.getGongsixingzhi())
            .eq("yuexin", xiangqin.getYuexin())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XiangqinEntity xiangqinEntity = xiangqinService.selectOne(queryWrapper);
        if(xiangqinEntity==null){
            xiangqin.setInsertTime(new Date());
            xiangqin.setCreateTime(new Date());
        xiangqinService.insert(xiangqin);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}

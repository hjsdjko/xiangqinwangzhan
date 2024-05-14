package com.dao;

import com.entity.XiangqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangqinView;

/**
 * 相亲 Dao 接口
 *
 * @author 
 */
public interface XiangqinDao extends BaseMapper<XiangqinEntity> {

   List<XiangqinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

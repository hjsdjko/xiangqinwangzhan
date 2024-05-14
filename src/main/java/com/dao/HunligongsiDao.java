package com.dao;

import com.entity.HunligongsiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HunligongsiView;

/**
 * 婚礼公司 Dao 接口
 *
 * @author 
 */
public interface HunligongsiDao extends BaseMapper<HunligongsiEntity> {

   List<HunligongsiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

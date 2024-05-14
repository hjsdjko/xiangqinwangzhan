package com.dao;

import com.entity.HunligongsiOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HunligongsiOrderView;

/**
 * 婚礼公司预约 Dao 接口
 *
 * @author 
 */
public interface HunligongsiOrderDao extends BaseMapper<HunligongsiOrderEntity> {

   List<HunligongsiOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

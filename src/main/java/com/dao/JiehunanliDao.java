package com.dao;

import com.entity.JiehunanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiehunanliView;

/**
 * 结婚案例 Dao 接口
 *
 * @author 
 */
public interface JiehunanliDao extends BaseMapper<JiehunanliEntity> {

   List<JiehunanliView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

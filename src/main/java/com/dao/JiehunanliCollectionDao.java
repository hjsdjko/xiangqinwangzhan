package com.dao;

import com.entity.JiehunanliCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiehunanliCollectionView;

/**
 * 结婚案例收藏 Dao 接口
 *
 * @author 
 */
public interface JiehunanliCollectionDao extends BaseMapper<JiehunanliCollectionEntity> {

   List<JiehunanliCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

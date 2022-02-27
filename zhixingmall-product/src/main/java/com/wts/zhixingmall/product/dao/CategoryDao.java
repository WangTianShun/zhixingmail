package com.wts.zhixingmall.product.dao;

import com.wts.zhixingmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wts
 * @email 563540326@qq.com
 * @date 2022-02-26 10:35:39
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

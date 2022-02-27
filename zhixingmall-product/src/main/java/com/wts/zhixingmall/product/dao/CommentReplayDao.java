package com.wts.zhixingmall.product.dao;

import com.wts.zhixingmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author wts
 * @email 563540326@qq.com
 * @date 2022-02-26 10:35:39
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}

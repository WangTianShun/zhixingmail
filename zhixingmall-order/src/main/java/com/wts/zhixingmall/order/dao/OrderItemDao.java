package com.wts.zhixingmall.order.dao;

import com.wts.zhixingmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wts
 * @email 563540326@qq.com
 * @date 2022-02-26 10:32:46
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}

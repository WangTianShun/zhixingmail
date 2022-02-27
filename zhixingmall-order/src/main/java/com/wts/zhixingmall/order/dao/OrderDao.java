package com.wts.zhixingmall.order.dao;

import com.wts.zhixingmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wts
 * @email 563540326@qq.com
 * @date 2022-02-26 10:32:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

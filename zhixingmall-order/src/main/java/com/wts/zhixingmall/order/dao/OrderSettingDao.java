package com.wts.zhixingmall.order.dao;

import com.wts.zhixingmall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author wts
 * @email 563540326@qq.com
 * @date 2022-02-26 10:32:46
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}

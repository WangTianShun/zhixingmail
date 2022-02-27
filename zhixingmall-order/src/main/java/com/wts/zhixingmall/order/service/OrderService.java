package com.wts.zhixingmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wts.common.utils.PageUtils;
import com.wts.zhixingmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wts
 * @email 563540326@qq.com
 * @date 2022-02-26 10:32:46
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


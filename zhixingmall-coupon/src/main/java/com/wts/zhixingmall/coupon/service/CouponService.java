package com.wts.zhixingmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wts.common.utils.PageUtils;
import com.wts.zhixingmall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author wts
 * @email 563540326@qq.com
 * @date 2022-02-26 10:20:31
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.wts.zhixingmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wts.common.utils.PageUtils;
import com.wts.zhixingmall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author wts
 * @email 563540326@qq.com
 * @date 2022-02-26 10:20:29
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


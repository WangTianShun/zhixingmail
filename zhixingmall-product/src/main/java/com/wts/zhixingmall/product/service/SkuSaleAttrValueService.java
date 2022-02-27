package com.wts.zhixingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wts.common.utils.PageUtils;
import com.wts.zhixingmall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author wts
 * @email 563540326@qq.com
 * @date 2022-02-26 10:35:38
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


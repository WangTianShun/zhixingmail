package com.wts.zhixingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wts.common.utils.PageUtils;
import com.wts.zhixingmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author wts
 * @email 563540326@qq.com
 * @date 2022-02-26 10:35:39
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


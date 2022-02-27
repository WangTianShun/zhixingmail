package com.wts.zhixingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wts.common.utils.PageUtils;
import com.wts.zhixingmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wts
 * @email 563540326@qq.com
 * @date 2022-02-26 10:35:40
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


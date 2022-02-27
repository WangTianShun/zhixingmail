package com.wts.zhixingmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wts.common.utils.PageUtils;
import com.wts.zhixingmall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author wts
 * @email 563540326@qq.com
 * @date 2022-02-26 10:20:30
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.wts.zhixingmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wts.common.utils.PageUtils;
import com.wts.zhixingmall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author wts
 * @email 563540326@qq.com
 * @date 2022-02-26 10:28:40
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.wts.zhixingmall.member.feign;

import com.wts.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: CouponFeignService
 * @Author: WangTianShun
 * @Date: 2022/2/26 16:53
 * @Version 1.0
 */

//远程客户端(这是一个声明式的远程调用)
@FeignClient("zhixingmall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupon();
}

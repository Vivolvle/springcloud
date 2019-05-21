package com.vivolvle.api_gateway.filter;

/**
 * 限流
 * @Author: weilz
 * @Date: 2019/5/21 18:01
 */
//@Component
//public class RateFilter extends ZuulFilter {
//    //每秒钟放100个令牌
//    private static final RateLimiter RATE_LIMITER = RateLimiter.create(100);
//
//    @Override
//    public String filterType() {
//        return PRE_TYPE;
//    }
//
//    @Override
//    public int filterOrder() {
//        return SERVLET_DETECTION_FILTER_ORDER-1;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        if (!RATE_LIMITER.tryAcquire()) {
//            throw new IllegalStateException("令牌被取完了");
//        }
//        return null;
//    }
//}

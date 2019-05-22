package com.vivolvle.api_gateway.filter;

/**
 * 权限拦截（区分买家和卖家）
 *
 * @Author: weilz
 * @Date: 2019/5/21 17:24
 */
//@Component
//public class AuthFilter extends ZuulFilter {
//    @Override
//    public String filterType() {
//        return PRE_TYPE;
//    }
//
//    @Override
//    public int filterOrder() {
//        return PRE_DECORATION_FILTER_ORDER - 1;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        RequestContext requestContext = RequestContext.getCurrentContext();
//        HttpServletRequest request = requestContext.getRequest();
//        /**
//         * /order/create 只能买家访问 openId
//         * /order/finish 只能卖家访问 token
//         * /product/list 都能访问
//         */
//        if ("/user/order/create".equals(request.getRequestURI())) {
//            Cookie cookie = CookieUtil.get(request, "openId");
//            if (cookie == null || StringUtils.isEmpty(cookie.getValue())) {
//                requestContext.setSendZuulResponse(false);
//                requestContext.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
//            }
//        }
//        if(request.getRequestURI().startsWith("/user/order/finish/")){
//            Cookie cookie = CookieUtil.get(request, "token");
//            if (cookie == null || StringUtils.isEmpty(cookie.getValue())) {
//                requestContext.setSendZuulResponse(false);
//                requestContext.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
//            }
//        }
//        return null;
//    }
//}

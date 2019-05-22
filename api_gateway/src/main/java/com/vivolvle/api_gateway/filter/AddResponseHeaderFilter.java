package com.vivolvle.api_gateway.filter;

/**
 * @Author: weilz
 * @Date: 2019/5/21 17:47
 */
//@Component
//public class AddResponseHeaderFilter extends ZuulFilter {
//    @Override
//    public String filterType() {
//        return POST_TYPE;
//    }
//
//    @Override
//    public int filterOrder() {
//        return SEND_RESPONSE_FILTER_ORDER - 1;
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
//        HttpServletResponse response = requestContext.getResponse();
//        response.setHeader("X-Foo", UUID.randomUUID().toString());
//        return null;
//    }
//}

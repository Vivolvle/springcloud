package com.vivolvle.api_gateway.filter;

/**
 * @Author: weilz
 * @Date: 2019/5/21 17:24
 */
//@Component
//public class TokenFilter extends ZuulFilter {
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
//        //这里从url获取，也可以从cookie，header里面获取
//        String token = request.getParameter("token");
//        if (StringUtils.isEmpty(token)) {
//            requestContext.setSendZuulResponse(false);
//            requestContext.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
//        }
//        return null;
//    }
//}

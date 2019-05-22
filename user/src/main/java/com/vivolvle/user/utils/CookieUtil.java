package com.vivolvle.user.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: weilz
 * @Date: 2019/5/22 14:18
 */
public class CookieUtil {

    public static void set(HttpServletResponse response,String name,String value,int maxAge){
        Cookie cookie = new Cookie(name, value);
        cookie.setPath("/");
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }
}

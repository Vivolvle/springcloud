package com.vivolvle.user.controller;

import com.vivolvle.user.entity.UserInfo;
import com.vivolvle.user.response.ServerResponce;
import com.vivolvle.user.service.UserService;
import com.vivolvle.user.utils.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @author weilz
 * @date 2019/5/21
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get/{id}")
    public ServerResponce getById(@PathVariable("id") Integer id) {
        return ServerResponce.createBySuccess(userService.getUserById(id));
    }

    @GetMapping("/buyer")
    public ServerResponce buyer(@RequestParam("name") String name, @RequestParam("password") String password, HttpServletResponse response) {
        UserInfo userInfo = userService.getUser(name, password, (byte) 1);
        if (null == userInfo) {
            return ServerResponce.createByErrorMessage("登录失败");
        }
        //两小时后过期
        CookieUtil.set(response, "openId", "123", 7200);
        return ServerResponce.createBySuccessMessage("登陆成功");
    }

    @GetMapping("/seller")
    public ServerResponce seller(@RequestParam("name") String name, @RequestParam("password") String password, HttpServletResponse response) {
        UserInfo userInfo = userService.getUser(name, password, (byte) 2);
        if (null == userInfo) {
            return ServerResponce.createByErrorMessage("登录失败");
        }
        //两小时后过期
        CookieUtil.set(response, "openId", "456", 7200);
        return ServerResponce.createBySuccessMessage("登陆成功");
    }

}

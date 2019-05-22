package com.vivolvle.user.controller;

import com.vivolvle.user.command.UserInfoCommand;
import com.vivolvle.user.entity.UserInfo;
import com.vivolvle.user.response.ServerResponce;
import com.vivolvle.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/buyer")
    public ServerResponce buyer(@RequestBody UserInfoCommand userInfoCommand){
        UserInfo userInfo = userService.getUser(userInfoCommand.getName(), userInfoCommand.getPassword(),(byte)1);
        if (null==userInfo) {
            return ServerResponce.createByErrorMessage("登录失败");
        }
        return ServerResponce.createBySuccessMessage("登陆成功");
    }
    @PostMapping("/seller")
    public ServerResponce seller(@RequestBody UserInfoCommand userInfoCommand){
        UserInfo userInfo = userService.getUser(userInfoCommand.getName(), userInfoCommand.getPassword(),(byte)2);
        if (null==userInfo) {
            return ServerResponce.createByErrorMessage("登录失败");
        }
        return ServerResponce.createBySuccessMessage("登陆成功");
    }

}

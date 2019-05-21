package com.vivolvle.user.controller;

import com.vivolvle.user.entity.UserInfo;
import com.vivolvle.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weilz
 * @date 2019/5/21
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get/{id}")
    public UserInfo getById(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }


}

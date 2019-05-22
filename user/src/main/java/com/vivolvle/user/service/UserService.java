package com.vivolvle.user.service;

import com.vivolvle.user.entity.UserInfo;

/**
 * @author weilz
 * @date 2019/5/21
 */
public interface UserService {
    UserInfo getUserById(Integer id);

    UserInfo getUser(String name, String password, byte type);
}

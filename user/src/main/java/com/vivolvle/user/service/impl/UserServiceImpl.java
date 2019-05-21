package com.vivolvle.user.service.impl;

import com.netflix.discovery.converters.Auto;
import com.vivolvle.user.entity.UserInfo;
import com.vivolvle.user.repository.UserInfoRepository;
import com.vivolvle.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author weilz
 * @date 2019/5/21
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo getUserById(Integer id) {
        UserInfo userInfo = userInfoRepository.findById(id).get();
        return userInfo;
    }
}

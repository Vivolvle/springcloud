package com.vivolvle.user.repository;

import com.vivolvle.user.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author weilz
 * @date 2019/5/21
 */
public interface UserInfoRepository extends JpaRepository<UserInfo,Object> {
    UserInfo findByNameAndPasswordAndType(String name,String password,byte type);
}

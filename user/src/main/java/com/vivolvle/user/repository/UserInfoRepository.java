package com.vivolvle.user.repository;

import com.vivolvle.user.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * @author weilz
 * @date 2019/5/21
 */
public interface UserInfoRepository extends CrudRepository<UserInfo,Object> {
    UserInfo findByNameAndPasswordAndType(String name,String password,byte type);
}

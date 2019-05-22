package com.vivolvle.user.command;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: weilz
 * @Date: 2019/5/22 12:06
 */
@Data
public class UserInfoCommand {
    @NotNull(message = "姓名")
    private String name;
    @NotNull(message = "密码")
    private String password;
}

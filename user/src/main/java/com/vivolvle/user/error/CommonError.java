package com.vivolvle.user.error;

/**
 * @Author: alphago
 * @Date: 2019/1/5 19:59
 * @Version 1.0
 */
public interface CommonError {
    int getErrorCode();

    String getErrorMsg();

    CommonError setErrorMsg(String msg);
}

package com.vivolvle.user.error;

/**
 * @Author: alphago
 * @Date: 2019/1/5 20:01
 * @Version 1.0
 */
public enum EmBusinessError implements CommonError {

    // 通用类型错误00001
    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),
    UNKNOWN_ERROR(10002, "未知错误"),

    // 20000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001, "用户不存在"),
    USER_LOGIN_FAIL(20002, "用户手机号或密码不正确"),
    USER_NOT_LOGIN(20003, "用户还未登陆"),

    // 30000
    FILE_UPLOAD_FAIL(30001, "文件上传失败"),
    FILE_IS_NULL(30002, "上传文件为空"),
    UPLOAD_FAIL_NOT_SUPPORT(30002, "上传文件格式不支持"),
    MAIN_PARAMETER_MISS(30003, "缺少必要参数");

    private int errorCode;

    private String errorMsg;

    EmBusinessError(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    @Override
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMsg() {
        return this.errorMsg;
    }

    @Override
    public CommonError setErrorMsg(String msg) {
        this.errorMsg = msg;
        return this;
    }
}

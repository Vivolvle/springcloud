package com.vivolvle.user.error;

/**
 * @Author: alphago
 * @Date: 2019/1/5 20:45
 * @Version 1.0
 */
// 包装器业务异常类实现
public class BusinessException extends RuntimeException implements CommonError {

    private static final long serialVersionUID = 1L;

    private CommonError commonError;

    // 直接接收EmbusinessError的传参用于构造业务异常
    public BusinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }

    // 接收自定义errorMsg的方式构造业务异常
    public BusinessException(CommonError commonError, String errorMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrorMsg(errorMsg);
    }

    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrorMsg() {
        return this.commonError.getErrorMsg();
    }

    @Override
    public CommonError setErrorMsg(String msg) {
        this.commonError.setErrorMsg(msg);
        return this;
    }
}

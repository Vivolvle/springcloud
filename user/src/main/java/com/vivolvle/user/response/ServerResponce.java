package com.vivolvle.user.response;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 积分大厅配置（管理员）
 *
 * @author weilz
 * @date 2019/3/26
 */
// 保证序列化对象的时候，如果是null对象，key也会消失
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ServerResponce<T> {

    private int status;

    private String msg;

    private T data;

    private ServerResponce(int status) {
        this.status = status;
    }

    private ServerResponce(int status, T data) {
        this.status = status;
        this.data = data;
    }

    private ServerResponce(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private ServerResponce(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public boolean isSuccess() {
        return this.status == ResponseCode.SUCCESS.getCode();
    }

    public int getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public static <T> ServerResponce<T> createBySuccess() {
        return new ServerResponce<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerResponce<T> createBySuccessMessage(String msg) {
        return new ServerResponce<T>(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> ServerResponce<T> createBySuccess(T data) {
        return new ServerResponce<T>(ResponseCode.SUCCESS.getCode(), data);
    }

    public static <T> ServerResponce<T> createBySuccess(String msg, T data) {
        return new ServerResponce<T>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> ServerResponce<T> createByError() {
        return new ServerResponce<T>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDesc());
    }

    public static <T> ServerResponce<T> createByErrorMessage(String errorMessage) {
        return new ServerResponce<T>(ResponseCode.ERROR.getCode(), errorMessage);
    }

    public static <T> ServerResponce<T> createByErrorCodeMessage(int errorCode, String errorMessage) {
        return new ServerResponce<T>(errorCode, errorMessage);
    }
}

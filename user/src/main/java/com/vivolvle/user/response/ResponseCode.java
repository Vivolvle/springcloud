package com.vivolvle.user.response;

/**
 * 积分大厅配置（管理员）
 *
 * @author weilz
 * @date 2019/3/26
 */
public enum ResponseCode {

    ERROR(0, "ERROR"),
    SUCCESS(1, "SUCCESS");

    private final int code;

    private final String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}

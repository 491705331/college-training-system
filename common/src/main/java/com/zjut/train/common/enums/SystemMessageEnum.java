package com.zjut.train.common.enums;

import lombok.Getter;

@Getter
public enum SystemMessageEnum {

    /**
     * 成功
     */
    SUCCESS(2000,"成功"),
    FAIL(4000,"失败"),
    SYSTEM_ERROR(4001,"系统错误"),
    UN_KNOWN_EXCEPTION(4002,"未知异常"),

    ;

    private final Integer code;
    private final String msg;

    SystemMessageEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

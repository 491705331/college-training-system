package com.zjut.train.common;

import com.zjut.train.common.enums.SystemMessageEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lcg
 */
@Data
public class R<T> {

    @ApiModelProperty("消息码")
    private Integer code;

    @ApiModelProperty("具体消息")
    private String msg;

    @ApiModelProperty("数据")
    private T data;


    public R(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R(SystemMessageEnum systemMessageEnum) {
        this.code = systemMessageEnum.getCode();
        this.msg = systemMessageEnum.getMsg();
    }

    public R(SystemMessageEnum systemMessageEnum, T data) {
        this.code = systemMessageEnum.getCode();
        this.msg = systemMessageEnum.getMsg();
        this.data = data;
    }

    public static <T> R<T> ok(T data) {
        return new R<>(SystemMessageEnum.SUCCESS,data);
    }

    public static <T> R<T> ok() {
        return R.ok(null);
    }

    public static <T> R<T> fail(T data) {
        return new R<>(SystemMessageEnum.FAIL,data);
    }

    public static <T> R<T> fail() {
        return R.fail(null);
    }

}
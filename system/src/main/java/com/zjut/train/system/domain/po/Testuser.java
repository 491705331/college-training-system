package com.zjut.train.system.domain.po;

import lombok.Data;

import java.util.Date;

/**
 * @author lcg
 */
@Data
public class Testuser {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 生日
     */
    private Date birthday;
}

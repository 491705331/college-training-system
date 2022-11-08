package com.zjut.train.system.domain.po;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
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
    @ExcelIgnore
    private Long id;

    /**
     * 用户名
     */
    @ExcelProperty(value = "测试学生姓名",index = 0)
    private String username;

    /**
     * 密码
     */
    @ExcelIgnore
    private String password;

    /**
     * 生日
     */
    @ExcelProperty(value = "测试学生生日",index = 1)
    private Date birthday;
}

package com.zjut.train.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "学生模块")
@RequestMapping("/student")
public class StudentController {



    @ApiOperation("添加学生")
    @PostMapping("/add")
    public void add () {

    }

    @ApiOperation("导出学生信息")
    @GetMapping("/export")
    public void export () {

    }

    //todo excel

}

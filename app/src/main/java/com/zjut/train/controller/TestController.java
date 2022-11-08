package com.zjut.train.controller;


import com.zjut.train.system.domain.po.Testuser;
import com.zjut.train.system.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author lcg
 */
@RestController
@Api(tags = "测试模块")
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/1")
    public List<Testuser> testOne () {
        return testService.getUserList();
    }

    @ApiOperation("导出excel信息")
    @GetMapping("/export")
    public void testExport(HttpServletResponse response){
        testService.export(response);
    }

    @ApiOperation("导入excel信息（未测试）")
    @GetMapping("/import")
    public void testImport(MultipartFile file){
        testService.importData(file);
    }
}

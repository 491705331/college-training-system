package com.zjut.train.controller;


import com.zjut.train.system.domain.po.Testuser;
import com.zjut.train.system.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lcg
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/1")
    public List<Testuser> testOne () {
        return testService.getUserList();
    }
}

package com.zjut.train.system.mapper;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

// todo test
@SpringBootTest
class TestMapperTest {

    @Resource
    private TestMapper testMapper;

    @Test
    void test1 () {
        System.out.println(testMapper.selectOne(1L));
    }
}
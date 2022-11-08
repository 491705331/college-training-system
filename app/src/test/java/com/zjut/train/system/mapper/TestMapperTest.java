package com.zjut.train.system.mapper;


import com.zjut.train.system.domain.po.Testuser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class TestMapperTest {

    @Resource
    private TestMapper testMapper;

    @Test
    void test1 () {

    }

    void testAdd() {
        Testuser testuser = new Testuser();
        testuser.setUsername("ww");
//        testuser.setPassword("Lisi");
        System.out.println(testMapper.insert(testuser));
        System.out.println(testuser.getId());
    }

    @Test
    void testUpdate() {
        Testuser testuser = new Testuser();
        testuser.setId(3L);
        testuser.setUsername("fffff");
        System.out.println(testMapper.updateById(testuser));
        System.out.println(testuser);
    }

    @Test
    void testDelete() {
        Testuser testuser = new Testuser();
        testuser.setId(3L);
        System.out.println(testMapper.deleteById(3L));
    }
}
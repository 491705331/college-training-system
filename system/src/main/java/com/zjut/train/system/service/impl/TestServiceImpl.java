package com.zjut.train.system.service.impl;

import com.zjut.train.system.domain.po.Testuser;
import com.zjut.train.system.mapper.TestMapper;
import com.zjut.train.system.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lcg
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public List<Testuser> getUserList() {
        return testMapper.selectUserList();
    }
}

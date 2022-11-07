package com.zjut.train.system.service;


import com.zjut.train.system.domain.po.Testuser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lcg
 */
@Service
public interface TestService {

    /**
     * 获取所有用户
     * @return List<TestUser>
     */
    List<Testuser> getUserList();
}

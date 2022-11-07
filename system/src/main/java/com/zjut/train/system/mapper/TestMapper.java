package com.zjut.train.system.mapper;

import com.zjut.train.system.domain.po.Testuser;

import java.util.List;

/**
 * @author lcg
 */
public interface TestMapper {

    /**
     * 获取所有用户
     * @return list<User>
     */
    List<Testuser> selectUserList();

    /**
     * 获取所有用户
     * @return list<User>
     */
    Testuser selectOne(Long userId);
}

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

    /**
     * 插入数据
     * @param testuser 数据对象
     */
    boolean insert(Testuser testuser);

    /**
     * 更新数据
     * @param testuser 数据对象
     */
    boolean updateById(Testuser testuser);

    /**
     * 删除数据
     * @param testuserId id
     */
    boolean deleteById(Long testuserId);
}

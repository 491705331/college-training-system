package com.zjut.train.system.service;


import com.zjut.train.system.domain.po.Testuser;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpResponse;
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

    /**
     * 导出为excel数据
     * @param response HttpServletResponse
     */
    void export(HttpServletResponse response);

    /**
     * 导入excel数据
     * @param file file
     */
    void importData(MultipartFile file);
}

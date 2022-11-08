package com.zjut.train.system.service.impl;

import com.alibaba.excel.EasyExcel;
import com.zjut.train.system.config.excelListener.TestuserExcelListener;
import com.zjut.train.system.domain.po.Testuser;
import com.zjut.train.system.mapper.TestMapper;
import com.zjut.train.system.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
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

    @Override
    public void export(HttpServletResponse response) {
        try {
            String fileName = URLEncoder.encode("测试信息", StandardCharsets.UTF_8);

            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-disposition", "attachment;filename="+ fileName + ".xlsx");
            List<Testuser> dictList = testMapper.selectUserList();
            EasyExcel.write(response.getOutputStream(), Testuser.class).sheet(fileName).doWrite(dictList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void importData(MultipartFile file) {
        try {
            EasyExcel.read(file.getInputStream(),Testuser.class,new TestuserExcelListener()).sheet().doRead();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

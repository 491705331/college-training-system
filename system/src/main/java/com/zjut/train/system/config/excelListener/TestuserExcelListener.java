package com.zjut.train.system.config.excelListener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.zjut.train.system.domain.po.Testuser;
import com.zjut.train.system.mapper.TestMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


public class TestuserExcelListener extends AnalysisEventListener<Testuser> {
    @Resource
    private TestMapper testMapper;

    @Override
    public void invoke(Testuser testuser, AnalysisContext analysisContext) {
        //调用方法添加数据库
        testMapper.insert(testuser);
    }
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    }
}
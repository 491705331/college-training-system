package com.zjut.train;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author lcg
 */
@SpringBootApplication
@MapperScan("com.zjut.train.system.mapper")
public class TrainingApplication {
    public static void main(String[] args) {
        SpringApplication.run(TrainingApplication.class,args);
    }
}

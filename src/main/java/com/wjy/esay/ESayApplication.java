package com.wjy.esay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author WangJinYi 2020/1/21
 */
@MapperScan("com.wjy.**.mapper")
@SpringBootApplication
public class ESayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ESayApplication.class, args);
    }

}

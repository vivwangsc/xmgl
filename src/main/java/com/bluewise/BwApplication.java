package com.bluewise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author bluewise
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.bluewise.project.*.*.mapper")
public class BwApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(BwApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  蓝智启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
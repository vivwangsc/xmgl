package com.example.demo;

import com.bluewise.BwApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BwApplication.class)
public class DemoApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads() {
        String s = jdbcTemplate.queryForList("select * from sys_user ").toString();
        System.out.println(s);
    }

    @Test
    @Transactional
    public void tes1()
    {
    }

    @Test
    public void tes2()
    {
    }

}

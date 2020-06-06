package com.gordon.myblog;


import com.gordon.myblog.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class MyblogApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    public void selectAllTest() {
        System.out.println(userDao.queryById(1));
    }
}

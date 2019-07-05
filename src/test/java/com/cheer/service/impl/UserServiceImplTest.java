package com.cheer.service.impl;

import com.cheer.config.AppConfig;
import com.cheer.domain.User;
import com.cheer.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void getUser() {
    }

    @Test
    public void findUser() {
        User user = userService.findUser("admin");
        System.out.println(user);
    }

    @Test
    public void insertUser() {
        User user=new User("kk","1","null");
        userService.insertUser(user);
    }
}
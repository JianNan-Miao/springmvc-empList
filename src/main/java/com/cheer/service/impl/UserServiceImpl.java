package com.cheer.service.impl;

import com.cheer.dao.UserMapper;
import com.cheer.domain.User;
import com.cheer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUser(String username, String password) {
        User user = userMapper.getUser(username, password);
        return user;
    }

    @Override
    public User findUser(String username) {
        User user = userMapper.findUser(username);
        return user;
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}

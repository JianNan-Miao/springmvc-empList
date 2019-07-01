package com.cheer.service;

import com.cheer.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    public User getUser(@Param("username") String username, @Param("password") String password);

    public User  findUser(String username);

    public void  insertUser(User user);
}

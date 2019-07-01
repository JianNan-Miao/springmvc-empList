package com.cheer.dao;


import com.cheer.domain.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {
   public User getUser(@Param("username") String username, @Param("password") String password);

   public User  findUser(String username);

   public void  insertUser(User user);
}


package com.yuan.demo.dao;

import com.yuan.demo.entity.UserEntity;

import java.util.List;
public interface UserDao {

    void insertUser(UserEntity user);

    List<UserEntity> selectUsersAll();
}

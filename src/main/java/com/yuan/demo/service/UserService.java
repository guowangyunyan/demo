package com.yuan.demo.service;

import com.yuan.demo.entity.UserEntity;

import java.util.List;

public interface UserService {

    void addUser(UserEntity user);

    List<UserEntity> findUserAll();
} 

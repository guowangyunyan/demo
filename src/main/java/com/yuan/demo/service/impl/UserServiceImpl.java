package com.yuan.demo.service.impl;

import com.yuan.demo.entity.UserEntity;
import com.yuan.demo.dao.UserDao;
import com.yuan.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userMapper;

    @Override
    public void addUser(UserEntity user) {

        userMapper.insertUser(user);
    }

    @Override
    public List<UserEntity> findUserAll() {
        return userMapper.selectUsersAll();
    }
}

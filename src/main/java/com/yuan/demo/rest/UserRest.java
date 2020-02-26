package com.yuan.demo.rest;

import com.yuan.demo.dto.AddUserDto;
import com.yuan.demo.entity.UserEntity;
import com.yuan.demo.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {
    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String showPage() {
        return "add";
    }

    @RequestMapping("/show")
    public String show() {
        int a = 10 / 0;
        return "index";
    }

    @PostMapping("/save")
    public void addUser(@Validated @RequestBody AddUserDto user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(user.getName());
        userEntity.setAge(user.getAge());
        userService.addUser(userEntity);
    }
}

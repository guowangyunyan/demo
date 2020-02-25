package com.yuan.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter

public class UserEntity implements Serializable {

    private Long id;
    private String name;
    private Integer age;
}

package com.yuan.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@ToString
public class AddUserDto {
    @NotBlank
    private String name;
    @NotNull
    private Integer age;
}

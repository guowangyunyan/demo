package com.yuan.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@ToString
public class AddUserDto {
    @NotBlank
    private String name;
    @NotEmpty
    private Integer age;
}

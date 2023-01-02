package com.educandoweb.course.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String name;
    private String email;
    private String phone;
    private String password;
}

package com.educandoweb.course.entrypoint.controller.mapper;

import com.educandoweb.course.core.domain.User;
import com.educandoweb.course.entrypoint.controller.request.UserRequest;
import com.educandoweb.course.entrypoint.controller.response.UserResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserRequest userRequest);

    List<UserResponse> toUserResponse(List<User> user);

    UserResponse toUserResponseById(User user);
}

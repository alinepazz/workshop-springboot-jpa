package com.educandoweb.course.dataprovider.repository.mapper;

import com.educandoweb.course.core.domain.User;
import com.educandoweb.course.dataprovider.repository.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

    UserEntity toUserEntity(User user);

    List<User> toUser(List<UserEntity> userEntity);

    User toUserById (UserEntity userEntity);
}

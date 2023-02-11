package com.educandoweb.course.core.usecase;

import com.educandoweb.course.core.domain.User;

import java.util.UUID;

public interface FindUserByIdUseCase {

    User findById(UUID id);
}

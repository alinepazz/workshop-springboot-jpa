package com.educandoweb.course.core.usecase;

import com.educandoweb.course.core.domain.User;

import java.util.UUID;

public interface UpdateUserUseCase {

    void update(UUID id, User user);
}

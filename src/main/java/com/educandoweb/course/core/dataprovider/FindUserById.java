package com.educandoweb.course.core.dataprovider;

import com.educandoweb.course.core.domain.User;

import java.util.Optional;
import java.util.UUID;

public interface FindUserById {

    Optional<User> findUserById(UUID id);
}

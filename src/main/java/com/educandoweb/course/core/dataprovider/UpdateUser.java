package com.educandoweb.course.core.dataprovider;

import com.educandoweb.course.core.domain.User;

import java.util.UUID;

public interface UpdateUser {

    void update(UUID id, User user);
}

package com.educandoweb.course.core.usecase;

import com.educandoweb.course.core.domain.User;
import java.util.List;

public interface FindAllUsersUseCase {

    List<User> findAll();
}

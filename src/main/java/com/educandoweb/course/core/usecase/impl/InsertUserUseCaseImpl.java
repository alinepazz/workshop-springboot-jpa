package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.InsertUser;
import com.educandoweb.course.core.domain.User;
import com.educandoweb.course.core.usecase.InsertUserUseCase;
import org.springframework.stereotype.Component;

@Component
public class InsertUserUseCaseImpl implements InsertUserUseCase {

    private final InsertUser insertUser;

    public InsertUserUseCaseImpl(InsertUser insertUser) {
        this.insertUser = insertUser;
    }

    @Override
    public void insert(User user) {
        insertUser.insert(user);
    }
}

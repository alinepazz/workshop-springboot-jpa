package com.educandoweb.course.config.user;

import com.educandoweb.course.core.usecase.impl.FindUserByIdUseCaseImpl;
import com.educandoweb.course.dataprovider.FindUserByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindUserByIdConfig {

    @Bean
    public FindUserByIdUseCaseImpl findUserByIdUseCase(FindUserByIdImpl findAllUsers){
        return new FindUserByIdUseCaseImpl(findAllUsers);
    }
}

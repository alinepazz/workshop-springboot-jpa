package com.educandoweb.course.config.user;

import com.educandoweb.course.core.usecase.impl.FindAllUsersUseCaseImpl;
import com.educandoweb.course.dataprovider.FindAllUsersImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllUserConfig {

    @Bean
    public FindAllUsersUseCaseImpl findAllUsersUseCase(FindAllUsersImpl findAllUsers){
        return new FindAllUsersUseCaseImpl(findAllUsers);
    }
}

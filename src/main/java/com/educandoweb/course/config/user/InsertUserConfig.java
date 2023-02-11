package com.educandoweb.course.config.user;

import com.educandoweb.course.core.usecase.impl.InsertUserUseCaseImpl;
import com.educandoweb.course.dataprovider.InsertUserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertUserConfig {

    @Bean
    public InsertUserUseCaseImpl insertUserUseCase(InsertUserImpl insertUser){
        return new InsertUserUseCaseImpl(insertUser);
    }
}

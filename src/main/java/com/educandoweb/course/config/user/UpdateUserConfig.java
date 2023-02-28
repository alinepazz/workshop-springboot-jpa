package com.educandoweb.course.config.user;

import com.educandoweb.course.core.usecase.impl.UpdateUserUseCaseImpl;
import com.educandoweb.course.dataprovider.UpdateUserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateUserConfig {

    @Bean
    public UpdateUserUseCaseImpl updateUserUseCase(UpdateUserImpl updateUser){
        return new UpdateUserUseCaseImpl(updateUser);
    }
}

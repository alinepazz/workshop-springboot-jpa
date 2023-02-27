package com.educandoweb.course.config.user;


import com.educandoweb.course.core.usecase.impl.DeleteUserUseCaseImpl;
import com.educandoweb.course.dataprovider.DeleteUserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteUserConfig {

    @Bean
    public DeleteUserUseCaseImpl deleteUserUseCase(DeleteUserImpl deleteUser){
        return new DeleteUserUseCaseImpl(deleteUser);
    }
}

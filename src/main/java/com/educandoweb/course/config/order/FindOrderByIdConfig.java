package com.educandoweb.course.config.order;

import com.educandoweb.course.core.usecase.impl.FindOrderByIdUseCaseImpl;
import com.educandoweb.course.dataprovider.FindOrderByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindOrderByIdConfig {

    @Bean
    public FindOrderByIdUseCaseImpl findOrderByIdUseCase(FindOrderByIdImpl findOrderById){
        return new FindOrderByIdUseCaseImpl(findOrderById);
    }
}

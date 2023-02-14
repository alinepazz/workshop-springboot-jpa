package com.educandoweb.course.config.product;

import com.educandoweb.course.core.usecase.impl.FindProductByIdUseCaseImpl;
import com.educandoweb.course.dataprovider.FindProductByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindProductByIdConfig {

    @Bean
    public FindProductByIdUseCaseImpl findProductByIdUseCase(FindProductByIdImpl findProductById){
        return new FindProductByIdUseCaseImpl(findProductById);
    }
}

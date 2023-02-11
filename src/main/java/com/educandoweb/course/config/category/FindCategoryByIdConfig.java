package com.educandoweb.course.config.category;

import com.educandoweb.course.core.usecase.impl.FindCategoryByIdUseCaseImpl;
import com.educandoweb.course.dataprovider.FindCategoryByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCategoryByIdConfig {

    @Bean
    public FindCategoryByIdUseCaseImpl findCategoryByIdUseCase(FindCategoryByIdImpl findCategoryById){
        return new FindCategoryByIdUseCaseImpl(findCategoryById);
    }
}

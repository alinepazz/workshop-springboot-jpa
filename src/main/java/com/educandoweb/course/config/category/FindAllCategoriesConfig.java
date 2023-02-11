package com.educandoweb.course.config.category;

import com.educandoweb.course.core.usecase.impl.FindAllCategoriesUseCaseImpl;
import com.educandoweb.course.dataprovider.FindAllCategoriesImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllCategoriesConfig {

    @Bean
    public FindAllCategoriesUseCaseImpl findAllCategoriesUseCase(FindAllCategoriesImpl findAllCategories){
        return new FindAllCategoriesUseCaseImpl(findAllCategories);
    }
}

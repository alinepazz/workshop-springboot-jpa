package com.educandoweb.course.config.category;

import com.educandoweb.course.core.usecase.impl.InsertCategoryUseCaseImpl;
import com.educandoweb.course.dataprovider.InsertCategoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCategoryConfig {

    @Bean
    public InsertCategoryUseCaseImpl insertCategoryUseCase(InsertCategoryImpl insertCategory){
        return new InsertCategoryUseCaseImpl(insertCategory);
    }
}

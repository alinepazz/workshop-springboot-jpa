package com.educandoweb.course.config.product;

import com.educandoweb.course.core.usecase.impl.InsertProductUseCaseImpl;
import com.educandoweb.course.dataprovider.InsertProductImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertProductConfig {

    @Bean
    public InsertProductUseCaseImpl insertProductUseCase(InsertProductImpl insertProduct){
        return new InsertProductUseCaseImpl(insertProduct);
    }
}

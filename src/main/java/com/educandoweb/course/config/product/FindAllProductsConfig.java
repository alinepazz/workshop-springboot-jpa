package com.educandoweb.course.config.product;

import com.educandoweb.course.core.usecase.impl.FindAllProductsUseCaseImpl;
import com.educandoweb.course.dataprovider.FindAllProductsImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllProductsConfig {

    @Bean
    public FindAllProductsUseCaseImpl findAllProductsUseCase(FindAllProductsImpl findAllProducts){
        return new FindAllProductsUseCaseImpl(findAllProducts);
    }
}

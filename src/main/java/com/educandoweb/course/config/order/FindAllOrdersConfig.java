package com.educandoweb.course.config.order;

import com.educandoweb.course.core.usecase.impl.FindAllOrdersUseCaseImpl;
import com.educandoweb.course.dataprovider.FindAllOrdersImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllOrdersConfig {

    @Bean
    public FindAllOrdersUseCaseImpl findAllOrdersUseCase(FindAllOrdersImpl findAllOrders){
        return new FindAllOrdersUseCaseImpl(findAllOrders);
    }
}

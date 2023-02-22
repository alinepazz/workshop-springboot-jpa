package com.educandoweb.course.config.orderItem;

import com.educandoweb.course.core.usecase.impl.FindAllOrderItemsUseCaseImpl;
import com.educandoweb.course.dataprovider.FindAllOrderItemsImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllOrderItemsConfig {

    @Bean
    public FindAllOrderItemsUseCaseImpl findAllOrderItemsUseCase(FindAllOrderItemsImpl findAllOrderItems){
        return new FindAllOrderItemsUseCaseImpl(findAllOrderItems);
    }
}

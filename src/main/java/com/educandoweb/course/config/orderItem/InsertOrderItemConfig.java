package com.educandoweb.course.config.orderItem;

import com.educandoweb.course.core.usecase.impl.InsertOrderItemUseCaseImpl;
import com.educandoweb.course.dataprovider.InsertOrderItemImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertOrderItemConfig {

    @Bean
    public InsertOrderItemUseCaseImpl insertOrderItemUseCase(InsertOrderItemImpl insertOrderItem){
        return new InsertOrderItemUseCaseImpl(insertOrderItem);
    }
}

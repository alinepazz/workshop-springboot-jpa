package com.educandoweb.course.config.order;

import com.educandoweb.course.core.usecase.impl.InsertOrderUseCaseImpl;
import com.educandoweb.course.dataprovider.InsertOrderImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertOrderConfig {

    @Bean
    public InsertOrderUseCaseImpl insertOrderUserCase(InsertOrderImpl insertOrder){
        return new InsertOrderUseCaseImpl(insertOrder);
    }
}

package com.algaworks.msr.algalogapi.common;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguration {
    //Métodos:
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

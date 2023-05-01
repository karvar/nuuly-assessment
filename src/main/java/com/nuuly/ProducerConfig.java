package com.nuuly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfig {

    @Autowired
    private KafkaProducerService<String> kafkaProducerService;

    @Bean
    public Producer producer() {
        return new Producer(kafkaProducerService);
    }
}

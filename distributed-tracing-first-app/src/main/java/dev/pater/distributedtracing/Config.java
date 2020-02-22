package dev.pater.distributedtracing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
    @Bean
    RestTemplate rabbitTemplate(){
        return new RestTemplate();
    }
}

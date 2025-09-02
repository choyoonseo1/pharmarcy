package com.my.pharmacy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
// spring 시작할 때, @Configuration을 읽어서 Bean으로 등록해 놓는다.
// 사용자는 생성자주입 또는, @Autowired를 사용해서 쓴다.
public class RestTemplateConfig {
    // component밑에 bean(콩),  autowired로 필요한곳에 준다.
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

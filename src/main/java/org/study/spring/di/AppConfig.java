package org.study.spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Friend friend(){
        return new Friend("기본 이름");
    }

    @Bean
    public Greeter greeter(){
        Greeter greeter = new Greeter();
        greeter.setFormat("%s, 안녕하세요");
        return greeter;
    }
}

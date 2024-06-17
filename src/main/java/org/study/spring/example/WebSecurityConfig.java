package org.study.spring.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers(new AntPathRequestMatcher("/employees", "GET")).permitAll()
                .anyRequest().authenticated()
        ).httpBasic(basic->basic.realmName("My Realm")
                .authenticationEntryPoint((request, response, authException) -> {
                    System.out.println("인증 실패");
                })
        );
        return http.build();
    }
}

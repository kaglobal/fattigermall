package com.kaglobal.mallgateway.common;
/*

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.server.SecurityWebFilterChain;
*/

/**
 * @ClassName SecurityConfig
 * @Description TODO
 * @Author fuhang
 * @Date 2020/10/12 10:51
 * @Version 1.0.0
 **/
/*@Configuration
@EnableWebFluxSecurity*/
public class SecurityConfig {

  /*  *//**
     * 用户的接口类
     * @return
     *//*
    @Bean
    public MapReactiveUserDetailsService userDetailsService() {
        //自定义一个用户
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin")
                .roles("ADMIN")
                .build();
        return new MapReactiveUserDetailsService(user);
    }

    *//**
     * 主要过滤配置类
     * @param http
     * @return
     *//*
    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
                .authorizeExchange()
                .pathMatchers("/order/**").permitAll()
                .pathMatchers("/user/**").hasRole("ADMIN")
                .anyExchange().authenticated()
                .and()
                .httpBasic().and()
                .formLogin();
        return http.build();
    }*/
}
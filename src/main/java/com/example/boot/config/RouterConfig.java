package com.example.boot.config;

import com.example.boot.entity.User;
import com.example.boot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;

//@Configuration
public class RouterConfig {

    @Autowired
    private UserMapper userMapper;

    @Bean
    public RouterFunction<ServerResponse> listAll() {
        return RouterFunctions.route(RequestPredicates.GET("/users/all"),
                request -> {
                    Flux<User> userFlux = Flux.fromIterable(userMapper.list());
                    return ServerResponse.ok().body(userFlux, User.class);
                });
    }

}

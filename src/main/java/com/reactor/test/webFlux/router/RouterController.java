package com.reactor.test.webFlux.router;

import com.reactor.test.webFlux.router.handler.ExampleHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class RouterController {

    @Bean
    RouterFunction<ServerResponse> hello() {
        HandlerFunction<ServerResponse> helloHandlerFunction = req -> {
            Mono<String> result = Mono.just("Hello handlerFunction");
            return ok().body(result, String.class);
        };


        HandlerFunction helloHandler = req -> ok().body(fromObject("Hello " + req.pathVariable("name")));

        return RouterFunctions.route(GET("/hello"), helloHandlerFunction);
    }

    @Bean
    RouterFunction<ServerResponse> routerExample(ExampleHandler postHandler) {
        return RouterFunctions.route()
                .GET("/post/{id}", postHandler::getById)
                .GET("/coupon/{name}", postHandler::getById)
                .build();
    }
}

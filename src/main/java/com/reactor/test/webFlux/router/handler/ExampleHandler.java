package com.reactor.test.webFlux.router.handler;

import com.reactor.test.webFlux.router.request.ExampleRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class ExampleHandler {
    public Mono<ServerResponse> getById(ServerRequest request) {
        Long id = Long.parseLong(request.pathVariable("id"));
        ExampleRequest post = new ExampleRequest(id, "garden", "hello");

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(post);
    }
}

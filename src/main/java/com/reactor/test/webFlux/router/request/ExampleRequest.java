package com.reactor.test.webFlux.router.request;

import lombok.Value;

@Value
public class ExampleRequest {
    Long id;
    String title;
    String content;
}

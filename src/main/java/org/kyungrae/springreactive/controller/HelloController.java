package org.kyungrae.springreactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("heartbeat")
public class HelloController {
    @GetMapping("hello")
    public Mono<String> getHello() {
        return Mono.just("Hello");
    }
}

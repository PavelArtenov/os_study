package ru.openshift.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.openshift.app.service.WebClientService;

@RestController
@RequestMapping("test/")
public class PingController {

    private final WebClientService webClientService;

    public PingController(WebClientService client) {
        this.webClientService = client;
    }

    @GetMapping("ping")
    public String ping() {
        return "pong!";
    }

    @GetMapping("request")
    public String request() {
        return webClientService.sendRequest();
    }
}

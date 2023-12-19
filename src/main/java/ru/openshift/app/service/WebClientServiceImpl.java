package ru.openshift.app.service;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WebClientServiceImpl implements WebClientService {

    private final WebClient client;

    private static Long id = 0L;

    public WebClientServiceImpl(WebClient client) {
        this.client = client;
    }

    @Override
    public String sendRequest() {
       String response = client
                .post()
                .uri("/listener/save")
                .body(BodyInserters.fromValue(new Model(id++)))
               .retrieve()
               .bodyToMono(String.class)
               .block();

        return response;
    }
}

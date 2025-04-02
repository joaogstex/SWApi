package com.starwarsapi.starwarsapi.client;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.starwarsapi.starwarsapi.model.CharacterDataResponse;

import reactor.core.publisher.Mono;

@Service
public class StarWarsApiClient {
    
    private final WebClient webClient;

    public StarWarsApiClient(WebClient.Builder builder) {
        webClient = builder.baseUrl("https://swapi.dev/api/").build();
    }

    public Mono<CharacterDataResponse> findCharacterById(String id) {
        return webClient.get()
        .uri("/people/"+id)
        .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(CharacterDataResponse.class);
    }
}

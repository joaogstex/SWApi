package com.starwarsapi.starwarsapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starwarsapi.starwarsapi.client.StarWarsApiClient;
import com.starwarsapi.starwarsapi.model.CharacterDataResponse;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class StarWarsApiController {

    StarWarsApiClient starWarsApiClient;
    
    @GetMapping("/people/{id}")
    public Mono<CharacterDataResponse> getCharacterById(@PathVariable String id) {
        return starWarsApiClient.findCharacterById(id);
    }   
}

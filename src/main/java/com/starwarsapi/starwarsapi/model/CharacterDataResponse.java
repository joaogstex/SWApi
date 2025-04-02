package com.starwarsapi.starwarsapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterDataResponse(String name, @JsonProperty("birth_year") String birthYear, @JsonProperty("eye_color") String eyeColor, String gender, 
@JsonProperty("hair_color") String hairColor, String height, String mass, @JsonProperty("skin_color") String skinColor, String homeworld, List<String> films) {
    
}

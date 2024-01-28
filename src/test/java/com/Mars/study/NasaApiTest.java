package com.Mars.study;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class NasaApiTest {

    @Test
    public void NasaMarsApiTest() {


        RestTemplate rt = new RestTemplate();

        ResponseEntity<NasaResponse> forEntity = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1&api_key=62FQB9dDvEpei7mKgt7l8xQeB9aSS4efuTK0FrjE", NasaResponse.class);

        System.out.println(forEntity.getBody());

    }
}

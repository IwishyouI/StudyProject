package com.Mars.study.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NasaMarsService {


    public String getRoverData() {

        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> forEntity = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1&api_key=62FQB9dDvEpei7mKgt7l8xQeB9aSS4efuTK0FrjE", String.class);
        String body = forEntity.getBody();
        System.out.println(body);

        return body;
    }


}

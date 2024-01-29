package com.Mars.study.service;


import com.Mars.study.NasaMarsPhoto;
import com.Mars.study.NasaResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NasaMarsService {


    public NasaResponse getRoverData() {

        RestTemplate rt = new RestTemplate();
        ResponseEntity<NasaResponse> forEntity = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2&api_key=62FQB9dDvEpei7mKgt7l8xQeB9aSS4efuTK0FrjE", NasaResponse.class);
        NasaResponse body = forEntity.getBody();
        System.out.println(body);

        return body;
    }


}

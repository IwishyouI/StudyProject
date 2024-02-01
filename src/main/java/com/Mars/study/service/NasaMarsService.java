package com.Mars.study.service;


import com.Mars.study.HomeDto;
import com.Mars.study.NasaMarsPhoto;
import com.Mars.study.NasaResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class NasaMarsService {


    public NasaResponse getRoverData(HomeDto homeDto) {

        RestTemplate rt = new RestTemplate();
        ResponseEntity<NasaResponse> forEntity = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/" + homeDto.getMarsApiRoverData() + "/photos?sol=" + homeDto.getMarsSol() + "&api_key=62FQB9dDvEpei7mKgt7l8xQeB9aSS4efuTK0FrjE" + "&camera=FHAZ", NasaResponse.class);
        NasaResponse response = forEntity.getBody();
        List<String> apiUrlEndpoints = getApiUrlEndPoints(homeDto);
        System.out.println(response);
        List<NasaMarsPhoto> photos = new ArrayList<>();

        apiUrlEndpoints.stream().forEach(url -> {
            NasaResponse apiResponse = rt.getForObject(url, NasaResponse.class);
            photos.addAll(apiResponse.getPhotos());
        });

        response.setPhotos(photos);

        return response;
    }

    public List<String> getApiUrlEndPoints(HomeDto homeDto) {
        List<String> urls = new ArrayList<>();

        if (Boolean.TRUE.equals(homeDto.getCHEMCAM())) {
            urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/" + homeDto.getMarsApiRoverData() + "/photos?sol=" + homeDto.getMarsSol() + "&api_key=62FQB9dDvEpei7mKgt7l8xQeB9aSS4efuTK0FrjE" + "&camera=CHEMCAM");
        }

        if (Boolean.TRUE.equals(homeDto.getRHAZ())) {
            urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/" + homeDto.getMarsApiRoverData() + "/photos?sol=" + homeDto.getMarsSol() + "&api_key=62FQB9dDvEpei7mKgt7l8xQeB9aSS4efuTK0FrjE" + "&camera=RHAZ");
        }

        if (Boolean.TRUE.equals(homeDto.getMAST())) {
            urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/" + homeDto.getMarsApiRoverData() + "/photos?sol=" + homeDto.getMarsSol() + "&api_key=62FQB9dDvEpei7mKgt7l8xQeB9aSS4efuTK0FrjE" + "&camera=MAST");
        }

        if (Boolean.TRUE.equals(homeDto.getFHAZ())) {
            urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/" + homeDto.getMarsApiRoverData() + "/photos?sol=" + homeDto.getMarsSol() + "&api_key=62FQB9dDvEpei7mKgt7l8xQeB9aSS4efuTK0FrjE" + "&camera=FHAZ");
        }

        if (Boolean.TRUE.equals(homeDto.getMAHLI())) {
            urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/" + homeDto.getMarsApiRoverData() + "/photos?sol=" + homeDto.getMarsSol() + "&api_key=62FQB9dDvEpei7mKgt7l8xQeB9aSS4efuTK0FrjE" + "&camera=MAHLI");
        }

        if (Boolean.TRUE.equals(homeDto.getMARDI())) {
            urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/" + homeDto.getMarsApiRoverData() + "/photos?sol=" + homeDto.getMarsSol() + "&api_key=62FQB9dDvEpei7mKgt7l8xQeB9aSS4efuTK0FrjE" + "&camera=MARDI");
        }

        if (Boolean.TRUE.equals(homeDto.getNAVCAM())) {
            urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/" + homeDto.getMarsApiRoverData() + "/photos?sol=" + homeDto.getMarsSol() + "&api_key=62FQB9dDvEpei7mKgt7l8xQeB9aSS4efuTK0FrjE" + "&camera=NAVCAM");
        }

        if (Boolean.TRUE.equals(homeDto.getPANCAM())) {
            urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/" + homeDto.getMarsApiRoverData() + "/photos?sol=" + homeDto.getMarsSol() + "&api_key=62FQB9dDvEpei7mKgt7l8xQeB9aSS4efuTK0FrjE" + "&camera=PANCAM");
        }

        if (Boolean.TRUE.equals(homeDto.getMINITES())) {
            urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/" + homeDto.getMarsApiRoverData() + "/photos?sol=" + homeDto.getMarsSol() + "&api_key=62FQB9dDvEpei7mKgt7l8xQeB9aSS4efuTK0FrjE" + "&camera=MINITES");
        }

        return urls;
    }
}

package com.Mars.study;

import java.util.ArrayList;
import java.util.List;

public class NasaResponse {


    List<NasaMarsPhoto> photos = new ArrayList<>();

    public List<NasaMarsPhoto> getPhotos() {
        return photos;
    }

    public void setPhotos(List<NasaMarsPhoto> photos) {
        this.photos = photos;
    }


    @Override
    public String toString() {
        return "NasaResponse{" +
                "photos=" + photos +
                '}';
    }
}

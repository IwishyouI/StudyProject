package com.Mars.study;

import java.util.Date;

public class NasaMarsPhoto {


    private Long id;
    private Integer sol;
    private NasaCamera camera;

    private String imgSrc;
    private Date earthDate;

    private NasaRover rover;


    public NasaRover getRover() {
        return rover;
    }

    public void setRover(NasaRover rover) {
        this.rover = rover;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSol() {
        return sol;
    }

    public void setSol(Integer sol) {
        this.sol = sol;
    }

    public NasaCamera getCamera() {
        return camera;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public void setCamera(NasaCamera camera) {
        this.camera = camera;
    }


    public Date getEarthDate() {
        return earthDate;
    }

    public void setEarthDate(Date earthDate) {
        this.earthDate = earthDate;
    }

    @Override
    public String toString() {
        return "NasaMarsPhoto{" +
                "id=" + id +
                ", sol=" + sol +
                ", camera=" + camera +
                ", imgSrc='" + imgSrc + '\'' +
                ", earthDate=" + earthDate +
                ", rover=" + rover +
                '}';
    }
}

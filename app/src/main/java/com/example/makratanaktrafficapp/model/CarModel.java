package com.example.makratanaktrafficapp.model;

public class CarModel {
    private String latitute, longtitute, speed;

    public CarModel(String latitute, String longtitute, String speed) {
        this.latitute = latitute;
        this.longtitute = longtitute;
        this.speed = speed;
    }

    public String getLatitute() {
        return latitute;
    }

    public void setLatitute(String latitute) {
        this.latitute = latitute;
    }

    public String getLongtitute() {
        return longtitute;
    }

    public void setLongtitute(String longtitute) {
        this.longtitute = longtitute;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}

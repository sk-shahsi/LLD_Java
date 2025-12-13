package com.stractural.flyweight;

public class Robot {
    // extrinsic data

    int coordinateX;
    int getCoordinateY;

    //intrinsic data
    String type;
    Sprites body; //heavy-weight object -2D bitmap image

    Robot(int coordinateX, int getCoordinateY, String type, Sprites body){
        this.coordinateX = coordinateX;
        this.getCoordinateY = getCoordinateY;
        this.body = body;
        this.type = type;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getGetCoordinateY() {
        return getCoordinateY;
    }

    public void setGetCoordinateY(int getCoordinateY) {
        this.getCoordinateY = getCoordinateY;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Sprites getBody() {
        return body;
    }

    public void setBody(Sprites body) {
        this.body = body;
    }
}

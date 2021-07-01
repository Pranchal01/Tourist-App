// All the variables used in this class wil be declared here.

package com.example.kotadarshan;

public class CoachingContent {

    private String titleText;
    private int imageId;
    private double mapX;
    private double mapY;
    private String infoURL;

    CoachingContent(String titleText, int imageId, double mapX, double mapY, String infoURL)
    {
        this.titleText = titleText;
        this.imageId = imageId;
        this.mapX = mapX;
        this.mapY = mapY;
        this.infoURL = infoURL;
    }

    public String getTitleText() {
        return titleText;
    }

    public int getImageId() {
        return imageId;
    }

    public double getMapX() {
        return mapX;
    }

    public double getMapY() {
        return mapY;
    }

    public String getInfoURL() {
        return infoURL;
    }
}

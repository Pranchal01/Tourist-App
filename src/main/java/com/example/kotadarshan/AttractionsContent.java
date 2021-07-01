// All the variables used in this class wil be declared here.


package com.example.kotadarshan;

public class AttractionsContent {

    private String titleText;
    private String descriptionText;
    private int imageId;
    private double mapX;
    private double mapY;
    private String textToSpeech;

    AttractionsContent(String titleText, String descriptionText, int imageId, double mapX, double mapY, String textToSpeech)
    {
        this.titleText = titleText;
        this.descriptionText = descriptionText;
        this.imageId = imageId;
        this.mapX = mapX;
        this.mapY = mapY;
        this.textToSpeech = textToSpeech;
    }

    public String getTitleText() {
        return titleText;
    }

    public String getDescriptionText() {
        return descriptionText;
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

    public String getTextToSpeech() {
        return textToSpeech;
    }
}

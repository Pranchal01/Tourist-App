// All the variables used in this class wil be declared here.


package com.example.kotadarshan;

public class RestaurantsContent {

    private String titleText;
    private int imageId;
    private double mapX;
    private double mapY;
    private String menuURL;
    private float rating;

    RestaurantsContent(String titleText, int imageId, double mapX, double mapY, String menuURL, float rating)
    {
        this.titleText = titleText;
        this.imageId = imageId;
        this.mapX = mapX;
        this.mapY = mapY;
        this.menuURL = menuURL;
        this.rating = rating;
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

    public String getMenuURL() {
        return menuURL;
    }

    public float getRating() {
        return rating;
    }
}

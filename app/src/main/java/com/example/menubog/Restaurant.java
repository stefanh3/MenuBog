package com.example.menubog;

public class Restaurant {

    private String restaurantID;
    private String name;
    private String description;
    private String imgFileName;

    public String getRestaurantID() {
        return restaurantID;
    }

    public String getDescription() {
        return description;
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public Restaurant(String name, String description, String imgFileName, String restaurantID) {
        this.name = name;
        this.description = description;
        this.imgFileName = imgFileName;
        this.restaurantID = restaurantID;
    }
}

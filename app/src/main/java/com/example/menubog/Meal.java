package com.example.menubog;

public class Meal {
    public String mealID;
    public String restaurantID;
    public String foodName;
    public String description;
    public String price;
    public String imgRef;

    public Meal(String mealID, String restaurantID, String foodName, String description, String price, String imgRef) {
        this.mealID = mealID;
        this.description = description;
        this.foodName = foodName;
        this.imgRef = imgRef;
        this.price = price;
        this.restaurantID = restaurantID;
    }

    public String getDescription() {
        return description;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getImgRef() {
        return imgRef;
    }

    public String getMealID() {
        return mealID;
    }

    public String getPrice() {
        return price;
    }

    public String getRestaurantID() {
        return restaurantID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setImgRef(String imgRef) {
        this.imgRef = imgRef;
    }

    public void setMealID(String mealID) {
        this.mealID = mealID;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealID='" + mealID + '\'' +
                ", restaurantID='" + restaurantID + '\'' +
                ", foodName='" + foodName + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", imgRef='" + imgRef + '\'' +
                '}';
    }
}


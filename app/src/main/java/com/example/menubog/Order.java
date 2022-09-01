package com.example.menubog;

public class Order {
    public String orderID;
    public String userID;
    public String restaurantID;
    public String mealID;
    public String time;
    public String cost;

    public Order(String orderID, String userID, String restaurantID, String mealID, String time, String cost) {
        this.orderID = orderID;
        this.userID = userID;
        this.restaurantID = restaurantID;
        this.mealID = mealID;
        this.time = time;
        this.cost = cost;
    }

    public String getRestaurantID() {
        return restaurantID;
    }

    public String getMealID() {
        return mealID;
    }

    public String getCost() {
        return cost;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getTime() {
        return time;
    }

    public String getUserID() {
        return userID;
    }

    public void setMealID(String mealID) {
        this.mealID = mealID;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", userID='" + userID + '\'' +
                ", restaurantID='" + restaurantID + '\'' +
                ", mealID='" + mealID + '\'' +
                ", time='" + time + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}

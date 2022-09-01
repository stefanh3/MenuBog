package com.example.menubog;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.view.Menu;

public class DBCursor extends CursorWrapper {

    public DBCursor(Cursor cursor) {
        super(cursor);
    }

    public Restaurant getRestaurant() {
        String id = getString(getColumnIndex(DBSchema.RestaurantTable.Cols.ID));
        String name = getString(getColumnIndex(DBSchema.RestaurantTable.Cols.NAME));
        String imgRef = getString(getColumnIndex(DBSchema.RestaurantTable.Cols.IMG_REF));
        String description = getString(getColumnIndex(DBSchema.RestaurantTable.Cols.DESCRIPTION));
        return new Restaurant(name, description, imgRef, id);
    }

    public Meal getMeal() {
        String id = getString(getColumnIndex(DBSchema.MealTable.cols.ID));
        String name = getString(getColumnIndex(DBSchema.MealTable.cols.NAME));
        String description = getString(getColumnIndex(DBSchema.MealTable.cols.DESCRIPTION));
        String imgRef = getString(getColumnIndex(DBSchema.MealTable.cols.IMG_REF));
        String price = getString(getColumnIndex(DBSchema.MealTable.cols.PRICE));
        String restaurantID = getString(getColumnIndex(DBSchema.MealTable.cols.RESTAURANT_ID));
        return new Meal(id, restaurantID, name, description, price, imgRef);
    }

    public User getUser() {
        String id = getString(getColumnIndex(DBSchema.UserTable.cols.ID));
        String name = getString(getColumnIndex(DBSchema.UserTable.cols.FIRST_NAME));
        String email = getString(getColumnIndex(DBSchema.UserTable.cols.EMAIL));
        String password = getString(getColumnIndex(DBSchema.UserTable.cols.PASSWORD));
        return new User(id, email, password, name);
    }

    public Order getOrder() {
        String id = getString(getColumnIndex(DBSchema.OrderTable.cols.ID));
        String restaurantID = getString(getColumnIndex(DBSchema.OrderTable.cols.RESTAURANTID));
        String userID = getString(getColumnIndex(DBSchema.OrderTable.cols.USERID));
        String mealID = getString(getColumnIndex(DBSchema.OrderTable.cols.MEALID));
        String price = getString(getColumnIndex(DBSchema.OrderTable.cols.COST));
        String time = getString(getColumnIndex(DBSchema.OrderTable.cols.TIME));
        return new Order(id, userID,restaurantID, mealID, time, price);
    }
}

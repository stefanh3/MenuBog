package com.example.menubog;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "MenuBog.db";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("create table "+ DBSchema.RestaurantTable.NAME+"("+ DBSchema.RestaurantTable.Cols.ID+" Text, "+ DBSchema.RestaurantTable.Cols.NAME+ " Text, "+ DBSchema.RestaurantTable.Cols.IMG_REF+" Text, "+ DBSchema.RestaurantTable.Cols.DESCRIPTION+" Text);");
        sqLiteDatabase.execSQL("create table "+ DBSchema.MealTable.NAME+"("+ DBSchema.MealTable.cols.ID+" Text, "+ DBSchema.MealTable.cols.NAME+ " Text, "+ DBSchema.MealTable.cols.RESTAURANT_ID+" Text, "+ DBSchema.MealTable.cols.NAME+" Text, "+ DBSchema.MealTable.cols.DESCRIPTION+" Text, "+ DBSchema.MealTable.cols.PRICE+" Text, "+ DBSchema.MealTable.cols.IMG_REF+" Text);");
        sqLiteDatabase.execSQL("create table "+ DBSchema.UserTable.NAME+"("+ DBSchema.UserTable.cols.ID+" Text, "+ DBSchema.UserTable.cols.FIRST_NAME+" Text, "+ DBSchema.UserTable.cols.EMAIL+" Text, "+ DBSchema.UserTable.cols.PASSWORD+ "Text);");
        sqLiteDatabase.execSQL("create table "+ DBSchema.OrderTable.NAME+"("+ DBSchema.OrderTable.cols.USERID+" Text, "+ DBSchema.OrderTable.cols.RESTAURANTID+ " Text, "+ DBSchema.OrderTable.cols.MEALID+" Text, "+ DBSchema.OrderTable.cols.TIME+" Text, "+ DBSchema.OrderTable.cols.COST+" Text);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

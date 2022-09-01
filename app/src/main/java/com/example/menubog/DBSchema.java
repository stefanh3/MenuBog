package com.example.menubog;

public class DBSchema {
    public static class RestaurantTable {
        public static final String NAME = "Restaurant";
        public static class Cols{
            public static final String ID = "restaurantID";
            public static final String NAME = "name";
            public static final String IMG_REF = "imgRef";
            public static final String DESCRIPTION = "description";
        }
    }

    public static class MealTable {
        public static final String NAME = "MealItem";
        public static class cols{
            public static final String ID = "mealID";
            public static final String RESTAURANT_ID = "restaurantID";
            public static final String NAME = "foodName";
            public static final String DESCRIPTION = "description";
            public static final String PRICE = "price";
            public static final String IMG_REF = "imgRef";
        }
    }

    public static class UserTable {
        public static final String NAME = "User";
        public static class cols {
            public static final String ID = "userID";
            public static final String EMAIL = "email";
            public static final String PASSWORD = "password";
            public static final String FIRST_NAME = "name";
        }
    }

    public static class OrderTable {
        public static final String NAME = "Orders";
        public static class cols{
            public static final String ID = "orderID";
            public static final String USERID = "userID";
            public static final String RESTAURANTID = "restaurantID";
            public static final String MEALID = "mealID";
            public static final String TIME = "time";
            public static final String COST = "cost";
        }
    }


}

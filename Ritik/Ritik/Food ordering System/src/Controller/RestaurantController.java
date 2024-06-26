package Controller;

import Model.FoodItem;
import Model.Restaurant;
import Service.impl.RestaurantServiceImpl;

import java.util.ArrayList;

public class RestaurantController {

    static RestaurantServiceImpl restaurantService = new RestaurantServiceImpl();


    public  String createRestaurant(int ownerId, String name, String address, String phone ) {
        return restaurantService.createRestaurant(ownerId,name,address,phone);
    }



}

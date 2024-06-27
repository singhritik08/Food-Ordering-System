package Controller;

import Model.Restaurant;
import Service.impl.RestaurantServiceImpl;

import java.util.List;

public class RestaurantController {

    static RestaurantServiceImpl restaurantService = new RestaurantServiceImpl();


    public  String createRestaurant(int ownerId, String name, String address, String phone ) {
        return restaurantService.createRestaurant(ownerId,name,address,phone);
    }


    public String updateRestaurant(int restaurantId,int userId ,String name, String address, String phone) {
        return  restaurantService.updateRestaurant(restaurantId,userId,name,address,phone);
    }


    public boolean deleteRestaurant(int restaurantId) {
       return restaurantService.deleteRestaurant(restaurantId);
    }

    public List<Restaurant> getRestaurantbyOwner(int ownerId){
       return restaurantService.getRestaurantbyOwner(ownerId);
    }

//    public int getRestId(int userId) {
//        return restaurantService.getRestId(userId);
//    }
}

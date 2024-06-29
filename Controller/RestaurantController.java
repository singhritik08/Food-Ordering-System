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

    public List<Restaurant> getRestaurantdetailbyOwner(int ownerId){
       return restaurantService.getRestaurantdetailbyOwner(ownerId);
    }

    public int getRestIdbyOwnerId(int ownerId){
        return restaurantService.getRestIdbyOwnerId(ownerId);
    }

    public int isRestaurantExist(String restaurantName, String phone) {
        return restaurantService.isRestaurantExist(restaurantName,phone);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }
}

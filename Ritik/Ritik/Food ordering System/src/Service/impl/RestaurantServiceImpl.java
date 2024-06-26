package Service.impl;

import Model.Restaurant;
import Repostitiory.impl.RestaurantRepositoryImpl;
import Service.RestaurantService;

public class RestaurantServiceImpl implements RestaurantService {

     RestaurantRepositoryImpl restaurantRepository = new RestaurantRepositoryImpl();

    static int restaurantId = 1;

    public boolean signup(String ownerid, String name, String address, String phone) {
        return false;
    }

    @Override
    public String createRestaurant(int ownerId, String name, String address, String phone) {
        Restaurant restaurant = new Restaurant(restaurantId,ownerId,name,address,phone);
        restaurantRepository.saveRestaurant(restaurant);
        System.out.println("Your Restaurant Id is : "+restaurantId);
        System.out.println("Congratulation For Your New Restaurant...");

        restaurantId++;
        return "Restaurant Created :  "+name;
    }



}

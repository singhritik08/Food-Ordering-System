package Service.impl;

import Model.Restaurant;
import Repostitiory.impl.RestaurantRepositoryImpl;
import Service.RestaurantService;

import java.util.List;

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


    public String updateRestaurant(int restaurantId,int userId, String name, String address, String phone) {
        Restaurant restaurant = restaurantRepository.updateRestaurant(restaurantId,name,address);
        if(restaurant != null){
            return ("restaurant updated");
        }
        else{
            return("inavild restaurant id");
        }
    }

    @Override
    public boolean deleteRestaurant(int restaurantId) {
        Restaurant resturant = restaurantRepository.deleteRestaurant(restaurantId);
        if(resturant != null){
            return true;
        }
        return false;
    }

    @Override
    public List<Restaurant> getRestaurantbyOwner(int ownerId) {
        List<Restaurant> restaurant = restaurantRepository.findbyOwnerId(ownerId);
        if(restaurant.isEmpty()){
            System.out.println("No restaurant found");
            return null;
        }
        return restaurant;
    }

//    @Override
//    public int getRestId(int userId) {
//        int restId = restaurantRepository.getRestId(userId);
//        if(restId == -1){
//            System.out.println("Enter a valid user Id");
//            return -1;
//        }
//        return restId;
//    }




}

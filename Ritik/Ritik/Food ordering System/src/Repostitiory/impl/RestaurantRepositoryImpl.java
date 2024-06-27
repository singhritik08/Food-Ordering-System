package Repostitiory.impl;

import Model.Restaurant;
import Repostitiory.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepositoryImpl implements RestaurantRepository {

   private final List<Restaurant> restaurantList = new ArrayList<>();


    @Override
    public Restaurant saveRestaurant(Restaurant restaurant) {
        restaurantList.add(restaurant);
        return restaurant;
    }

    @Override
    public Restaurant updateRestaurant(int restaurantId, String name, String address) {
        for(Restaurant restaurant : restaurantList){
            if(restaurant.getRestaurantID() == restaurantId){
                restaurant.setName(name);
                restaurant.setAddress(address);
                return restaurant;
            }
        }
        return  null;
    }

    @Override
    public Restaurant deleteRestaurant(int restaurantId) {
        for(Restaurant restaurant : restaurantList){
            if(restaurant.getRestaurantID()== restaurantId){
                restaurantList.remove(restaurant);
                return restaurant;
            }
        }
        return null;
    }

    @Override
    public List<Restaurant> findbyOwnerId(int ownerId) {
        List<Restaurant> details = new ArrayList<>();
        for (Restaurant restaurant : restaurantList){
            if (restaurant.getOwnerId() == ownerId){
                details.add(restaurant);
            }
        }
        return details;
    }

//    @Override
//    public int getRestId(int userId) {
//        for (Restaurant restaurant : restaurantList){
//            if (restaurant.getOwnerId().equals(userId)) {
//                return restaurant.getRestaurantID();
//            }
//        }
//        return -1;
//    }

}
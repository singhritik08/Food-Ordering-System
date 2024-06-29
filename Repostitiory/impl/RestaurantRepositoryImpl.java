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
    public List<Restaurant>
    findbyOwnerId(int ownerId) {
        List<Restaurant> details = new ArrayList<>();
        for (Restaurant restaurant : restaurantList){
            if (restaurant.getOwnerId() == ownerId){
                details.add(restaurant);
            }
        }
        return details;
    }

    @Override
    public int getRestIdbyOwnerId(int ownerId) {
        for (Restaurant restaurant : restaurantList){
            if(restaurant.getOwnerId() == ownerId){
                return restaurant.getRestaurantID();
            }
        }
        return -1;
    }

    @Override
    public int isRestaurantExist(String restaurantName, String phone) {
        for (Restaurant restaurant : restaurantList){
            if(restaurant.getPhone().equals(phone)){
                return restaurant.getRestaurantID();
            }
        }
        return -1;
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantList;
    }


}
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
}
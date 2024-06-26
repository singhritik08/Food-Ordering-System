package Repostitiory;

import Model.Restaurant;

import java.util.List;

public interface RestaurantRepository {
    Restaurant saveRestaurant(Restaurant restaurant);


    Restaurant updateRestaurant(int restaurantId,String name,String address);

    Restaurant deleteRestaurant(int restaurantId);

    List<Restaurant> findbyOwnerId(int ownerId);

    int getRestIdbyOwnerId(int ownerId);

    int isRestaurantExist(String restaurantName, String phone);

    List<Restaurant> getAllRestaurants();

//    int getRestId(int userId);
}

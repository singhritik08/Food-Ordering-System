package Repostitiory;

import Model.Restaurant;

import java.util.List;

public interface RestaurantRepository {
    Restaurant saveRestaurant(Restaurant restaurant);


    Restaurant updateRestaurant(int restaurantId,String name,String address);

    Restaurant deleteRestaurant(int restaurantId);

    List<Restaurant> findbyOwnerId(int ownerId);

//    int getRestId(int userId);
}

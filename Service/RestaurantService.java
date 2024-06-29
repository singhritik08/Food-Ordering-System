package Service;

import Model.Restaurant;

import java.util.List;

public interface RestaurantService {
    public boolean signup(String ownerid, String name, String address, String phone);

    String createRestaurant(int ownerId, String name, String address, String phone);

    String updateRestaurant(int restaurantId,int userId, String name, String address, String phone);

    boolean deleteRestaurant(int restaurantId);

    List<Restaurant> getRestaurantdetailbyOwner(int ownerId);

    int getRestIdbyOwnerId(int ownerId);

    int isRestaurantExist(String restaurantName, String phone);

    List<Restaurant> getAllRestaurants();

//    int getRestId(int userId);
}

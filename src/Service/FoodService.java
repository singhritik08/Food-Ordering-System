package Service;

import Model.FoodItem;

import java.util.List;

public interface FoodService {
    String addFoodItem(int id, int restaurantId, String name, String description, double price, boolean availbility);

    String updateFoodItem(int id, int restaurantId, String name, String description, double price, boolean availability);

    boolean deleteFoodItem(int foodItemId);

    List<FoodItem> getFoodItembyRestaurant(int restaurantId);
}

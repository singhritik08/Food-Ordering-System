package Repostitiory;

import Model.FoodItem;

import java.util.List;

public interface FoodRepository {
    FoodItem addFoodItem(FoodItem foodItem);

    FoodItem updateFoodItem(int foodItemId, int restaurantId,String name, String description, double price, boolean availability);

    FoodItem deleteFoodItem(int foodItemId);

    List<FoodItem> getFoodItembyRestaurant(int restaurantId);
}

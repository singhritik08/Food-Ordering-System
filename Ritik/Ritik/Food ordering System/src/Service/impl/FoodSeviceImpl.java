package Service.impl;

import Model.FoodItem;
import Repostitiory.impl.FoodRepositoryImpl;
import Service.FoodService;

public class FoodSeviceImpl implements FoodService {
    private final FoodRepositoryImpl foodRepository = new FoodRepositoryImpl();
    @Override
    public String addFoodItem(int foodItemId, int restaurantId, String name, String description, double price, boolean availability) {
        FoodItem foodItem = new FoodItem(foodItemId,restaurantId,name,description,price,availability);
        foodRepository.addFoodItem(foodItem);
        return "Food Item added";
    }

    @Override
    public String updateFoodItem(int foodItemId, int restaurantId, String name, String description, double price, boolean availability) {
        FoodItem foodItem = new FoodItem(foodItemId,restaurantId,name,description,price,availability);
        foodRepository.updateFoodItem(foodItem);
        return "Item updated";
    }
}

package Controller;

import Model.FoodItem;
import Service.FoodService;
import Service.impl.FoodSeviceImpl;

import java.util.List;

public class FoodController {
    private final FoodSeviceImpl foodService = new FoodSeviceImpl();

    public String addFoodItem(int foodItemId, int restaurantId, String name, String description, double price, boolean availbility){
        return foodService.addFoodItem(foodItemId,restaurantId,name,description,price,availbility);
    }
    public String updateFoodItem(int foodItemId, int restaurantId, String name, String description, double price, boolean availbility){
        return foodService.updateFoodItem(foodItemId,restaurantId,name,description,price,availbility);
    }
    public boolean deleteFoodItem(int foodItemId){
        return foodService.deleteFoodItem(foodItemId);
    }
    public List<FoodItem> getFoodItembyRestaurant(int restaurantId){
        return foodService.getFoodItembyRestaurant(restaurantId);
    }


}

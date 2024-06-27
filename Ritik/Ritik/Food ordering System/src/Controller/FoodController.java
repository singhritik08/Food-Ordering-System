package Controller;

import Service.impl.FoodSeviceImpl;

public class FoodController {
    private final FoodSeviceImpl foodService = new FoodSeviceImpl();

    public String addFoodItem(int foodItemId, int restaurantId, String name, String description, double price, boolean availbility){
        return foodService.addFoodItem(foodItemId,restaurantId,name,description,price,availbility);
    }
    public String updateFoodItem(int foodItemId, int restaurantId, String name, String description, double price, boolean availbility){
        return foodService.updateFoodItem(foodItemId,restaurantId,name,description,price,availbility);
    }


}

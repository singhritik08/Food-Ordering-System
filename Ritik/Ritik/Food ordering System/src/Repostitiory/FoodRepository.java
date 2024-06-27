package Repostitiory;

import Model.FoodItem;

public interface FoodRepository {
    String addFoodItem(FoodItem foodItem);


    void updateFoodItem(FoodItem foodItem);
}

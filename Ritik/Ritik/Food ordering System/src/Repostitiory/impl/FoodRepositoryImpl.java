package Repostitiory.impl;

import Model.FoodItem;
import Repostitiory.FoodRepository;

import java.util.ArrayList;
import java.util.List;

public class FoodRepositoryImpl implements FoodRepository {
    private List<FoodItem> foodItemList = new ArrayList<>();
    @Override
    public String addFoodItem(FoodItem foodItem) {
        foodItemList.add(foodItem);
        return "";
    }

    @Override
    public void updateFoodItem(FoodItem foodItem) {
        for (int i =0 ; i< foodItemList.size();i++){
            if(foodItemList.get(i).getFoodItemId() == foodItem.getFoodItemId()){
                foodItemList.set(i,foodItem);
            }
        }
    }


}

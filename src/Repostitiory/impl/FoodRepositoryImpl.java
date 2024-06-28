package Repostitiory.impl;

import Model.FoodItem;
import Repostitiory.FoodRepository;

import java.util.ArrayList;
import java.util.List;

public class FoodRepositoryImpl implements FoodRepository {
    private List<FoodItem> foodItemList = new ArrayList<>();
    @Override
    public FoodItem addFoodItem(FoodItem foodItem) {
        foodItemList.add(foodItem);
        return foodItem;
    }

    @Override
    public FoodItem updateFoodItem(int foodItemId,int restaurantId,String name, String description, double price, boolean availability) {
        for (FoodItem foodItem : foodItemList){
            if(foodItem.getFoodItemId() == foodItemId ){
                foodItem.setName(name);
                foodItem.setDescription(description);
                foodItem.setPrice(price);
                foodItem.setAvailability(availability);
                return foodItem;
            }
        }
        return null;
    }

    @Override
    public FoodItem deleteFoodItem(int foodItemId) {
        for (FoodItem foodItem : foodItemList){
            if(foodItem.getFoodItemId() == foodItemId){
                foodItemList.remove(foodItem);
                return foodItem;
            }
        }
        return null;
    }

    @Override
    public List<FoodItem> getFoodItembyRestaurant(int restaurantId) {
        List<FoodItem> foodItems = new ArrayList<>();
        for (FoodItem foodItem : foodItemList){
            if(foodItem.getRestaurantID() == restaurantId){
                foodItems.add(foodItem);
            }
        }
        return foodItems;
    }

}

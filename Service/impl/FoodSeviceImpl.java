package Service.impl;

import Model.FoodItem;
import Repostitiory.impl.FoodRepositoryImpl;
import Service.FoodService;

import java.util.List;

public class FoodSeviceImpl implements FoodService {
    private final FoodRepositoryImpl foodRepository = new FoodRepositoryImpl();
    int foodItemId =149;
    @Override
    public String addFoodItem( int restaurantId, String name, String description, double price, boolean availability) {
        FoodItem foodItem = new FoodItem(++foodItemId,restaurantId,name,description,price,availability);
        foodRepository.addFoodItem(foodItem);
        return "Food Item added";
    }

    @Override
    public String updateFoodItem(int foodItemId, int restaurantId, String name, String description, double price, boolean availability) {
        FoodItem foodItem = foodRepository.updateFoodItem(foodItemId,restaurantId,name,description,price,availability);
        if(foodItem != null){
            return "Item updated";
        }
        else {
            return "invalid foodItemId";
        }

    }

    @Override
    public boolean deleteFoodItem(int foodItemId) {
        FoodItem foodItem = foodRepository.deleteFoodItem(foodItemId);
        if(foodItem != null){
            return true;
        }
        return false;

    }

    @Override
    public List<FoodItem> getFoodItembyRestaurant(int restaurantId) {
        return foodRepository.getFoodItembyRestaurant(restaurantId);
    }

    @Override
    public List<FoodItem> listOfFoodItemByRestaurant(int restaurantId) {
        List<FoodItem> items = foodRepository.listOfFoodItemByRestaurant(restaurantId);
        if (items.isEmpty()){
            System.out.println("There is no item availabe...");
            return null;
        }
        return items;
    }

    @Override
    public double getPricebyItemId(int itemId) {
       double itemprice = foodRepository.getPricebyItemId(itemId);
        return itemprice;
    }


}

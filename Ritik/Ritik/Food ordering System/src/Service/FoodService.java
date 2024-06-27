package Service;

public interface FoodService {
    String addFoodItem(int id, int restaurantId, String name, String description, double price, boolean availbility);

    String updateFoodItem(int id, int restaurantId, String name, String description, double price, boolean availability);
}

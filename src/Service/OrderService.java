package Service;

import Model.FoodItem;

import java.util.List;

public interface OrderService {
    String placeOrder(int id, int customerId, int restaurant, List<FoodItem> foodItems, double price, String status);
}

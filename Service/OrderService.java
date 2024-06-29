package Service;

import Model.FoodItem;
import Model.Order;

import java.util.List;

public interface OrderService {
    String placeOrder(int customerId, int restaurant, List<FoodItem> foodItems, double price);

    List<Order> getOrdersByCustomer(int customerId);

    List<Order> getOrdersByRestaurant(int restaurantId);

    String updateOrder(int orderId, String status);

    String getOrderNamebyOrderId(int orderId);
}

package Repostitiory;

import Model.FoodItem;
import Model.Order;

import java.util.List;

public interface OrderRepository {

    Order saveOrder(Order order);

    List<Order> getOrdersByCustomer(int customerId);

    List<Order> getOrdersByRestaurant(int restaurantId);

    void updateOrder(int orderId, String status);

//    String getOrderNamebyOrderId(int orderId);
}

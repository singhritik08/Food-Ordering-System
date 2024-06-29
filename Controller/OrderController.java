package Controller;

import Model.FoodItem;
import Model.Order;
import Service.impl.OrderServiceImpl;

import java.util.List;

public class OrderController {
    private final OrderServiceImpl orderService = new OrderServiceImpl();

    public String placeOrder( int customerId, int restaurant, List<FoodItem> foodItems, double price){
        return orderService.placeOrder(customerId,restaurant,foodItems,price);
    }
    public List<Order> getOrdersByCustomer(int customerId){
        return orderService.getOrdersByCustomer(customerId);
    }

    public List<Order> getOrdersByRestaurant(int restaurantId){
        return orderService.getOrdersByRestaurant(restaurantId);
    }

    public String updateOrder(int orderId,String status){
        return orderService.updateOrder(orderId,status);
    }


    public String getOrderNamebyOrderId(int orderId) {
        return orderService.getOrderNamebyOrderId(orderId);
    }
}

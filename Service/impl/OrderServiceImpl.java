package Service.impl;

import Model.FoodItem;
import Model.Order;
import Repostitiory.impl.OrderRepositoryImpl;
import Service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    OrderRepositoryImpl orderRepository = new OrderRepositoryImpl();

    static int orderId = 799;



    @Override
    public String placeOrder(int customerId, int restaurantID, List<FoodItem> foodItems, double price) {
        Order order = new Order(++orderId,customerId,restaurantID,foodItems,price,"In Progress");
         orderRepository.saveOrder(order);
        return "Order Placed Success!!";
    }

    @Override
    public List<Order> getOrdersByCustomer(int customerId) {
        return orderRepository.getOrdersByCustomer(customerId);
    }

    @Override
    public List<Order> getOrdersByRestaurant(int restaurantId) {
        List<Order> orders = orderRepository.getOrdersByRestaurant(restaurantId);
        if (orders.isEmpty()){
            return null;
        }
        return orders;
    }

    @Override
    public String updateOrder(int orderId, String status) {
        orderRepository.updateOrder(orderId,status);
        return "Status Updated";
    }

    @Override
    public String getOrderNamebyOrderId(int orderId) {
//        orderRepository.getOrderNamebyOrderId(orderId);
        return "";
    }


}

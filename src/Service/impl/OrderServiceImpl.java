package Service.impl;

import Model.FoodItem;
import Repostitiory.OrderRepository;
import Repostitiory.impl.OrderRepositoryImpl;
import Service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    OrderRepositoryImpl orderRepository = new OrderRepositoryImpl();
    @Override
    public String placeOrder(int id, int customerId, int restaurant, List<FoodItem> foodItems, double price, String status) {
        orderRepository.placeOrder(id,customerId,restaurant,foodItems,price,status);
        return "";
    }
}

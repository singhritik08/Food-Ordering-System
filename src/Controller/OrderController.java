package Controller;

import Model.FoodItem;
import Service.impl.OrderServiceImpl;

import java.util.List;

public class OrderController {
    private final OrderServiceImpl orderService = new OrderServiceImpl();

    public String placeOrder(int id, int customerId, int restaurant, List<FoodItem> foodItems, double price, String status){
        return orderService.placeOrder(id,customerId,restaurant,foodItems,price,status);
    }

}

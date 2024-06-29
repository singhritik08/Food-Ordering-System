package Repostitiory.impl;

import Model.FoodItem;
import Model.Order;
import Repostitiory.OrderRepository;
import Service.OrderService;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {
private  final  List<Order> orderList = new ArrayList<>();


    @Override
    public Order saveOrder(Order order) {
        orderList.add(order);
        return order;
    }

    @Override
    public List<Order> getOrdersByCustomer(int customerId) {
        List<Order> orders = new ArrayList<>();
        for (Order order : orderList){
            if (order.getCustomerId() == customerId){
                orders.add(order);
            }
        }
        return orders;
    }

    @Override
    public List<Order> getOrdersByRestaurant(int restaurantId) {
        List<Order> orders = new ArrayList<>();
        for (Order order : orderList){
            if (order.getRestaurantID() == restaurantId){
                orders.add(order);
            }
        }
        return orders;
    }

    @Override
    public void updateOrder(int orderId, String status) {
        for (Order order: orderList){
            if(order.getOrderId() == orderId){
                order.setStatus(status);
            }
        }
    }

//    @Override
//    public String getOrderNamebyOrderId(int orderId) {
//        for (Order order : orderList){
//            if(order.getOrderId() == orderId){
//                List<FoodItem> item= order.getFoodItems();
//                for (FoodItem foodItem : item){
//                    if (order.getFoodItems())
//                }
//            }
//        }
//    }


}

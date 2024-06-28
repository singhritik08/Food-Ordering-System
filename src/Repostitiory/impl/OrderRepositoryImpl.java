package Repostitiory.impl;

import Model.FoodItem;
import Model.Order;
import Repostitiory.OrderRepository;
import Service.OrderService;

import java.util.List;

public class OrderRepositoryImpl implements OrderService {

    @Override
    public java.lang.String placeOrder(int id, int customerId, int restaurant, java.util.List<FoodItem> foodItems, double price,String status) {

        return "";
    }
}

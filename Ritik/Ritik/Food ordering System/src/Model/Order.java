package Model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private int customerId;
    private List<FoodItem> fooditems =  new ArrayList<>();
    private String totalprice;
    private String status;

    public Order(int orderId, int customerId, String totalprice, String status) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.totalprice = totalprice;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }



    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public List<FoodItem> getFooditems() {
        return fooditems;
    }

    public void setFoodItems(List<FoodItem> fooditems) {
        this.fooditems = fooditems;
    }
}

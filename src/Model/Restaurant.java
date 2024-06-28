package Model;

import java.util.List;

public class Restaurant {
    private int restaurantID;
    private int ownerId;
    private String name;
    private String address;
    private String phone;
    private List<FoodItem> foodItems;

    public Restaurant(int restaurantID, int ownerId, String name, String address, String phone ) {
        this.restaurantID = restaurantID;
        this.ownerId = ownerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }
}

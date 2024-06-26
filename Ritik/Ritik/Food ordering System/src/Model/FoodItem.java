package Model;

public class FoodItem {
    private int foodItemId;
    private int restaurantID;
    private String name;
    private String description;
    private String price;
    private boolean availability;

    public FoodItem(int foodItemId, int restaurantID, String name, String description, String price, boolean availability) {
        this.foodItemId = foodItemId;
        this.restaurantID = restaurantID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability = availability;
    }

    public int getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(int foodItemId) {
        this.foodItemId = foodItemId;
    }

    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}

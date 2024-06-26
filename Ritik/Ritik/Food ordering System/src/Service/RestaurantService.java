package Service;

public interface RestaurantService {
    public boolean signup(String ownerid, String name, String address, String phone);

    String createRestaurant(int ownerId, String name, String address, String phone);

}

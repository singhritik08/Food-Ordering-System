import Controller.RestaurantController;
import Controller.UserController;
import Model.Restaurant;

import java.util.List;

public class UI {
    public static void main(String[] args) {
        UserController userController = new UserController();
        RestaurantController restaurantController = new RestaurantController();

        userController.signup("ritik","123","singhritik","Owner");
        boolean isLoggedIn = userController.login("ritik","123");
        String email=userController.getemailByUsernameAndPassword("ritik","123");
        System.out.println(email);


        if (isLoggedIn) {
            int userId = userController.getIdByUsernameAndPassword("ritik","123");

            System.out.println(restaurantController.createRestaurant(userId,"restName","restAddress","OwnerPhoneNumber"));
//            System.out.println(restaurantController.createRestaurant(userId,"kabab","ad0","7644844528"));
            System.out.println(restaurantController.updateRestaurant(101,userId,"restName","restaddress","7644844"));
//            boolean isdeleted = restaurantController.deleteRestaurant(1);
//            if(isdeleted){
//                System.out.println("Restaurant deleted");
//            }
//            else
//                System.out.println("invalid restaurant id");


            List<Restaurant> restaurants = restaurantController.getRestaurantbyOwner(userId);
        if(restaurants !=null){
            for (Restaurant restaurant : restaurants){
                System.out.println("Restaurant  ID : "+restaurant.getRestaurantID());
                System.out.println("Restaurant Name : "+restaurant.getName());
                System.out.println("Restaurant Address : "+restaurant.getAddress());
                System.out.println("Owner Phone Number : "+restaurant.getPhone());
                System.out.println();            }
        }

        }






        }

    }

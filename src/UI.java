import Controller.FoodController;
import Controller.RestaurantController;
import Controller.UserController;
import Model.FoodItem;
import Model.Restaurant;
import Model.User;

import java.util.List;

public class UI {
    public static void main(String[] args) {
        UserController userController = new UserController();
        RestaurantController restaurantController = new RestaurantController();
        FoodController foodController = new FoodController();

        userController.signup("ritik","123","singhritik","Owner");
        boolean isLoggedIn = userController.login("ritik","123");
//        String email=userController.getemailByUsernameAndPassword("ritik","123");
//        System.out.println(email);


        if (isLoggedIn) {
///USER
            int userId = userController.getIdByUsernameAndPassword("ritik","123");
            List<User> users = userController.getuserprofile(userId);
            if(users !=null){
                for (User user : users){
                    System.out.println("User Email : "+user.getEmail());
                    System.out.println("Name : "+user.getUsername());
                    System.out.println("User Role : "+user.getRole());
                    System.out.println();            }
            }

///RESTAURANT

            System.out.println(restaurantController.createRestaurant(userId,"restName","restAddress","OwnerPhoneNumber"));
//            System.out.println(restaurantController.createRestaurant(userId,"kabab","ad0","7644844528"));
//            System.out.println(restaurantController.updateRestaurant(1,userId,"restName","restaddress","7644844"));
//            boolean isdeleted = restaurantController.deleteRestaurant(1);
//            if(isdeleted){
//                System.out.println("Restaurant deleted");
//            }
//            else
//                System.out.println("invalid restaurant id");


            List<Restaurant> restaurants = restaurantController.getRestaurantdetailbyOwner(userId);
        if(restaurants !=null){
            for (Restaurant restaurant : restaurants){
                System.out.println("Restaurant  ID : "+restaurant.getRestaurantID());
                System.out.println("Restaurant Name : "+restaurant.getName());
                System.out.println("Restaurant Address : "+restaurant.getAddress());
                System.out.println("Owner Phone Number : "+restaurant.getPhone());
                System.out.println();            }
        }
/// FOOD
            int RestaurantId = restaurantController.getRestIdbyOwnerId(userId);
            System.out.println(foodController.addFoodItem(1,RestaurantId,"paneer","paneer masala",100,true));
            System.out.println(foodController.addFoodItem(2,RestaurantId,"handi","chicken handi",400,true));
            System.out.println(foodController.updateFoodItem(2,RestaurantId,"chicken","chicken is love",155,false));
//            boolean isfooditemdeleted = foodController.deleteFoodItem(RestaurantId);
//            if(isfooditemdeleted== true){
//                System.out.println("item deleted"); // yha hamko id number bhi chahiye
//            }
//            else {
//                System.out.println("Invalid food item id");
//            }

            System.out.println();
            System.out.println();

            List<FoodItem> foodItems = foodController.getFoodItembyRestaurant(RestaurantId);
            for (FoodItem foodItem : foodItems){
                System.out.println(foodItem.getName()+" "+foodItem.getPrice()+" "+foodItem.isAvailability());
            }

        }






        }

    }

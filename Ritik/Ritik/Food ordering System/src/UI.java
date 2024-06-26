import Controller.RestaurantController;
import Controller.UserController;

public class UI {
    public static void main(String[] args) {
        UserController userController = new UserController();
        RestaurantController restaurantController = new RestaurantController();

        userController.signup("ritik","123","singhritik","Owner");
        boolean isLoggedIn = userController.login("ritik","123");
//        String email=userController.getemailByUsernameAndPassword("ritik","123");
//        System.out.println(email);
        if (isLoggedIn) {
            int userId = userController.getIdByUsernameAndPassword("ritik","123");

            System.out.println(restaurantController.createRestaurant(userId,"restName","restAddress","OwnerPhoneNumber"));
            System.out.println(restaurantController.createRestaurant(userId,"kabab","ad0","7644844528"));
        }





        }

    }

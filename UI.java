import Controller.FoodController;
import Controller.OrderController;
import Controller.RestaurantController;
import Controller.UserController;
import Model.FoodItem;
import Model.Order;
import Model.Restaurant;
import Model.User;

import java.util.List;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        UserController userController = new UserController();
        RestaurantController restaurantController = new RestaurantController();
        FoodController foodController = new FoodController();
        OrderController orderController = new OrderController();

        HelperClass helperClass = new HelperClass();

        Scanner sc = new Scanner(System.in);

        System.out.println("Food Ordering System Application");

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            if (choice == 1) {
                String username;
                System.out.print("Enter your Username: ");
                while (true) {
                    username = sc.nextLine();
                    if (helperClass.validateName(username)) {
                        break;
                    }
                    System.out.println("Invalid Username. Please enter a name without special characters:");
                }

                String password;
                System.out.print("Enter a strong password (Example@123): ");
                while (true) {
                    String messageFromPassManager = helperClass.validatePassword(password = sc.nextLine());
                    if (messageFromPassManager.equals("valid")) {
                        break;
                    }
                    System.out.println(messageFromPassManager);
                    System.out.print("Please enter a strong password (Example@123): ");
                }

                String email;
                System.out.print("Enter your email: ");
                while (true) {
                    email = sc.nextLine();
                    if (helperClass.validateEmail(email)) {
                        if (!userController.isEmailExist(email)) {
                            break;
                        }
                        System.out.println("This email is registered already.");
                        System.out.println("1. Enter a different email");
                        System.out.println("2. Go back to the main menu");

                        int emailChoice = sc.nextInt();
                        sc.nextLine(); // consume the leftover newline
                        if (emailChoice == 2) {
                            break;
                        }
                    } else {
                        System.out.println("Invalid email address. Please enter a valid email address:");
                    }
                }

                String role;
                System.out.print("Enter your role (owner or customer): ");
                while (true) {
                    role = sc.nextLine();
                    if (helperClass.validateRole(role)) {
                        break;
                    }
                    System.out.println("Invalid role. Please choose 'owner' or 'customer':");
                }

                userController.signup(username, password, email, role.toLowerCase());
                System.out.println("Registration successful.");

            } else if (choice == 2) {
                System.out.print("Enter your username: ");
                String username = sc.nextLine();
                System.out.print("Enter your password: ");
                String password = sc.nextLine();

                boolean isLoggedIn = userController.login(username, password);
                if (isLoggedIn) {
                    int userId = userController.getIdByUsernameAndPassword(username, password);
                    System.out.println("Login successful.");
                    String role = userController.getRoleByUsernameAndPassword(username, password);

                    while (true) {
                        if (role.equals("owner")) {
                            System.out.println("Please select an option:");
                            System.out.println("1. View Restaurant Profile");
                            System.out.println("2. Create  Restaurants");
                            System.out.println("3. Update  Restaurants");
                            System.out.println("4. Delete  Restaurants");
                            System.out.println("5. Create Food Items");
                            System.out.println("6. Update Food Items");
                            System.out.println("7. Delete Food Items");
                            System.out.println("8. View Orders");
                            System.out.println("9. Update Order Status");
                            System.out.println("10. Logout");

                            int userChoice = sc.nextInt();
                            sc.nextLine();  // Consume newline

                            switch (userChoice) {
                                case 1:
                                    // View Restaurant Profile
                                    List<User> users = userController.getuserprofile(userId);
                                    if (users != null) {
                                        for (User user : users) {
                                            System.out.println("User Email: " + user.getEmail());
                                            System.out.println("Username: " + user.getUsername());
                                            System.out.println("User Role: " + user.getRole());
                                            System.out.println();
                                        }
                                    }
                                    break;
                                case 2:
                                    // Create and Manage Restaurants
                                    System.out.print("Enter restaurant name: ");
                                    String restName = sc.nextLine();
                                    System.out.print("Enter restaurant address: ");
                                    String restAddress = sc.nextLine();
                                    System.out.print("Enter owner phone number: ");
                                    String ownerPhoneNumber = sc.nextLine();

                                    System.out.println(restaurantController.createRestaurant(userId, restName, restAddress, ownerPhoneNumber));

                                    List<Restaurant> restaurants = restaurantController.getRestaurantdetailbyOwner(userId);
                                    if (restaurants != null) {
                                        for (Restaurant restaurant : restaurants) {
                                            System.out.println("Restaurant ID: " + restaurant.getRestaurantID());
                                            System.out.println("Restaurant Name: " + restaurant.getName());
                                            System.out.println("Restaurant Address: " + restaurant.getAddress());
                                            System.out.println("Owner Phone Number: " + restaurant.getPhone());
                                            System.out.println();
                                        }
                                    }
                                    break;
                                case 3:
                                    int restaurantId = restaurantController.getRestIdbyOwnerId(userId);
                                    System.out.print("Enter restaurant name: ");
                                    String restNames = sc.nextLine();
                                    System.out.print("Enter restaurant address: ");
                                    String restAddresss = sc.nextLine();
                                    System.out.print("Enter owner phone number: ");
                                    String ownerPhoneNumbers = sc.nextLine();
                                    System.out.println(restaurantController.updateRestaurant(restaurantId,userId,restNames,restAddresss,ownerPhoneNumbers));
                                case 4:
                                    System.out.println("Enter Restaurant Id to be deleted");
                                    int resId = sc.nextInt();
                                    boolean isdeleted = restaurantController.deleteRestaurant(resId);
                                case 5:
                                    // Create Food Items
                                    restaurantId = restaurantController.getRestIdbyOwnerId(userId);

                                    System.out.print("Enter food name: ");
                                    String foodName = sc.nextLine();
                                    System.out.print("Enter food description: ");
                                    String foodDescription = sc.nextLine();
                                    System.out.print("Enter food price: ");
                                    double foodPrice = sc.nextDouble();
                                    System.out.print("Is food available (true/false): ");
                                    boolean isAvailable ;
                                    while (true) {
                                        try{
                                            isAvailable = sc.nextBoolean();
                                            break;
                                        }
                                        catch (Exception e){
                                            System.out.println("Invalid input.");
                                        }
                                    }
//
                                    sc.nextLine();  // Consume newline

                                    System.out.println(foodController.addFoodItem(restaurantId, foodName, foodDescription, foodPrice, isAvailable));

                                    List<FoodItem> foodItems = foodController.getFoodItembyRestaurant(restaurantId);
                                    for (FoodItem foodItem : foodItems) {
                                        System.out.println(foodItem.getName() + " " + foodItem.getPrice() + " ");
                                        if (foodItem.isAvailability()) {
                                            System.out.println("available");
                                        } else {
                                            System.out.println("un-available");
                                        }
                                    }
                                    break;
                                case 6:
                                    restaurantId = restaurantController.getRestIdbyOwnerId(userId);
                                    System.out.println("Enter the food Item Id TO be updated");
                                    int id=sc.nextInt();
                                    System.out.print("Enter food name: ");
                                    String foodNames = sc.nextLine();
                                    System.out.print("Enter food description: ");
                                    String foodDescriptions = sc.nextLine();
                                    System.out.print("Enter food price: ");
                                    double foodPrices = sc.nextDouble();
                                    System.out.print("Is food available (true/false): ");
                                    boolean isAvailabl;
                                    while (true) {
                                        try{
                                            isAvailabl = sc.nextBoolean();
                                            break;
                                        }
                                        catch (Exception e){
                                            System.out.println("Invalid input.");
                                        }
                                    }
                                    System.out.println(foodController.updateFoodItem(id, restaurantId, foodNames, foodDescriptions, foodPrices, isAvailabl));
                                case 7:
                                    System.out.println("Enter the food item Id to be deleted");
                                    int foodItemId =sc.nextInt();
                                    boolean isfooditemdeleted = foodController.deleteFoodItem(foodItemId);
                                          if (isfooditemdeleted == true) {
                                          System.out.println("item deleted");
                                          } else {
                                            System.out.println("Invalid food item id");
                                          }
                                case 8:
                                    // View Orders
                                    restaurantId = restaurantController.getRestIdbyOwnerId(userId);
                                    List<Order>  restaurantOrders = orderController.getOrdersByRestaurant(restaurantId);
                                    if(restaurantOrders.isEmpty()){
                                        System.out.println(" NO order placed yet");
                                    }else {
                                        for (Order order : restaurantOrders) {
                                            System.out.println("Order Id "+order.getOrderId() + "\n"+ "Customer Id"+ order.getCustomerId() + "\n" + "Price"+order.getTotalPrice() + "\n" +"Order Status"+ order.getStatus());
                                        }
                                    }
                                    break;
                                case 9:
                                    // Update food Item
                                    System.out.println("Enter order Id to be updated");
                                    int orderId= sc.nextInt();
                                    System.out.println("Enter status to update");
                                    String status = sc.nextLine();
                                    orderController.updateOrder(orderId,status);
                                case 10:
                                    System.out.println("Logging out...");
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please enter a valid option.");
                                    break;
                            }

                            if (userChoice == 10) {
                                break;
                            }
                        } else if (role.equals("customer")) {
                            System.out.println("Please select an option:");
                            System.out.println("1. View User Profile");
                            System.out.println("2. Place Order");
                            System.out.println("3. View Order History");
                            System.out.println("4. Logout");

                            int userChoice = sc.nextInt();
                            sc.nextLine();  // Consume newline

                            switch (userChoice) {
                                case 1:
                                    // View User Profile
                                    List<User> users = userController.getuserprofile(userId);
                                    if (users != null) {
                                        for (User user : users) {
                                            System.out.println("User Email: " + user.getEmail());
                                            System.out.println("Name: " + user.getUsername());
                                            System.out.println("User Role: " + user.getRole());
                                            System.out.println();
                                        }
                                    }
                                    break;
                                case 2:
                                    // Place Order
                                    List<Restaurant> restaurants = restaurantController.getAllRestaurants();
                                    for (Restaurant restaurant : restaurants) {
                                        System.out.println("Restaurant Id : "+restaurant.getRestaurantID());
                                        System.out.println("Restaurant Name : "+restaurant.getName());
                                    }

                                    System.out.print("Enter restaurant ID to view menu: ");
                                    int restIdForOrder = sc.nextInt();
                                    sc.nextLine();  // Consume newline

                                    List<FoodItem> items = foodController.listOfFoodItemByRestaurant(restIdForOrder);
                                    for (FoodItem foodItem : items) {
                                        System.out.println("Food ID: " + foodItem.getFoodItemId() + "\nFood Name: " + foodItem.getName() + "\nPrice: " + foodItem.getPrice() + "\nAvailability: " + foodItem.isAvailability());
                                    }

                                    System.out.print("Enter food ID to order: ");
                                    int foodId = sc.nextInt();
                                    sc.nextLine();  // Consume newline
                                    double itemPrice = foodController.getPricebyItemId(foodId);
                                    System.out.println(orderController.placeOrder(userId, restIdForOrder, items, itemPrice));
                                    break;
                                case 3:
                                    // View Order History
                                    List<Order> customerOrders = orderController.getOrdersByCustomer(userId);
                                    if(customerOrders.isEmpty()){
                                        System.out.println("No Orders placed");
                                    }else {
                                        for (Order order : customerOrders) {
                                            System.out.println("Order Id " + order.getOrderId() + "\n" + "Customer Id" + order.getCustomerId() + "\n" + "Price" + order.getTotalPrice() + "\n" + "Order Status" + order.getStatus());
                                        }
                                    }
                                    break;
                                case 4:
                                    System.out.println("Logging out...");
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please enter a valid option.");
                                    break;
                            }

                            if (userChoice == 4) {
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Login failed. Please check your credentials.");
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        sc.close();
    }
}

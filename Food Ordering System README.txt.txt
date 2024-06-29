
Restaurant Management System README

Overview
--------
This system provides functionalities for managing users, restaurants, food items, and orders within a restaurant environment. It allows users to register, manage restaurant details, food items, and process orders.

Entities
--------
1. User
   - Attributes: id, username, password, email, role
   
2. Restaurant
   - Attributes: id, ownerId, name, address, phone, foodItems (List of FoodItem)
   
3. FoodItem
   - Attributes: id, restaurantId, name, description, price, availability
   
4. Order
   - Attributes: id, customerId, restaurantId, foodItems (List of FoodItem), totalPrice, status

Repositories
------------
1. UserRepository
   - Methods: findByUsername, findByEmail
   
2. RestaurantRepository
   - Methods: findByOwnerId
   
3. FoodItemRepository
   - Methods: findByRestaurantId
   
4. OrderRepository
   - Methods: findByCustomerId, findByRestaurantId

Services
--------
1. UserService
   - Methods: register, login, getUserProfile
   
2. RestaurantService
   - Methods: createRestaurant, updateRestaurant, deleteRestaurant, getRestaurantsByOwnerId
   
3. FoodItemService
   - Methods: addFoodItem, updateFoodItem, deleteFoodItem, getFoodItemsByRestaurantId
   
4. OrderService
   - Methods: placeOrder, getOrdersByCustomerId, getOrdersByRestaurantId, updateOrderStatus

Controllers
-----------
1. UserController
   - Endpoints: Register a new user, Login a user, Get user profile
   
2. RestaurantController
   - Endpoints: Create a new restaurant, Update a restaurant, Delete a restaurant, Get restaurants by owner
   
3. FoodItemController
   - Endpoints: Add a food item, Update a food item, Delete a food item, Get food items by restaurant
   
4. OrderController
   - Endpoints: Place a new order, Get orders by customer, Get orders by restaurant, Update order status

Usage
-----
To use this system effectively:
- Start by registering as a user.
- As an owner, create your restaurant and manage its details and food items.
- Customers can browse restaurants, view food items, and place orders.
- Owners can track orders and update their status.

Technologies
------------
- Backend Framework: Java Spring Boot
- Database: PostgreSQL
- API Documentation: Swagger UI
- Authentication: JWT (JSON Web Tokens)

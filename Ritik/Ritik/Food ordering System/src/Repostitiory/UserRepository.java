package Repostitiory;

import Model.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    User findbyUsername(String Username);
    User findbyemail(String Email);
    
    List<User> getAllUsers();

    int getIdByUsernameAndPassword(String username, String password);

    String getemailByUsernameAndPassword(String username, String password);
}

package Repostitiory;

import Model.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    User findbyUsername(String Username);

    List<User> getAllUsers();

    int getIdByUsernameAndPassword(String username, String password);

    String getemailByUsernameAndPassword(String username, String password);

    List<User> findbyId(int userId);

    boolean isEmailExist(String email);

    String getRoleByUsernameAndPassword(String username, String password);
}

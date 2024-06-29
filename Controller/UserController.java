package Controller;

import Model.User;
import Service.impl.UserServiceImpl;

import java.util.List;

public class UserController {

   private final UserServiceImpl userService = new UserServiceImpl();

    public boolean signup(String username, String password, String email, String role) {
        return userService.signup(username, password, email, role);
    }

    public boolean login(String username, String password) {
        return userService.login(username, password);
    }

    public List<User> getuserprofile(int userId) {
        return userService.getuserProfile(userId);
    }



    public int getIdByUsernameAndPassword(String username, String password) {
        return userService.getIdByUsernameAndPassword(username,password);
    }

    public String getemailByUsernameAndPassword(String username, String password) {
        return userService.getemailByUsernameAndPassword(username,password);
    }

    public boolean isEmailExist(String email) {
        return userService.isEmailExist(email);
    }

    public String getRoleByUsernameAndPassword(String username, String password) {
        return  userService.getRoleByUsernameAndPassword(username,password);
    }
}

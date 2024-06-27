package Controller;

import Model.User;
import Service.impl.UserServiceImpl;

public class UserController {

   private final UserServiceImpl userService = new UserServiceImpl();

    public boolean signup(String username, String password, String email, String role) {
        return userService.signup(username, password, email, role);
    }

    public boolean login(String username, String password) {
        return userService.login(username, password);
    }

    public User getuser(String username) {
        return userService.getuserProfile(username);
    }

    public int getIdByUsernameAndPassword(String username, String password) {
        return userService.getIdByUsernameAndPassword(username,password);
    }

    public String getemailByUsernameAndPassword(String username, String password) {
        return userService.getemailByUsernameAndPassword(username,password);
    }

}

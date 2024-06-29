package Service;

import Model.User;

import java.util.List;

public interface UserService {

    boolean signup( String username, String password, String email, String role);
    boolean login(String username, String password);

    List<User> getuserProfile(int userId);

    int  getIdByUsernameAndPassword(String username,String password);
   String getemailByUsernameAndPassword(String username, String password);

    boolean isEmailExist(String email);

    String getRoleByUsernameAndPassword(String username, String password);

}

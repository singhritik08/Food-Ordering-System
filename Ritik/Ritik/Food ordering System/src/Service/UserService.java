package Service;

import Model.User;

public interface UserService {

    boolean signup( String username, String password, String email, String role);
    boolean login(String username, String password);
   int  getIdByUsernameAndPassword(String username,String password);
   String getemailByUsernameAndPassword(String username, String password);
}

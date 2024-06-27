package Service.impl;

import Model.User;
import Repostitiory.impl.UserRepositoryImpl;
import Service.UserService;

public class UserServiceImpl implements UserService {
     UserRepositoryImpl userepo = new UserRepositoryImpl();
    static int userId = 100;

    public boolean signup(String username, String password, String email, String role) {
        User user = new User(userId,username, password, email, role.toUpperCase());
        userepo.save(user);
        System.out.println("User Registered");
        System.out.println("Your User Id is : "+userId);
        userId++;
        return true;
    }

    public boolean login(String username, String password){
        User user = userepo.findbyUsername(username);
        if( user != null && user.getPassword().equals(password)) {
            System.out.println("Login Successfully");
            return true;
        }
        System.out.println("Invalid username or password");
        return false;
    }

    @Override
    public int getIdByUsernameAndPassword(String username, String password) {
        int userId = userepo.getIdByUsernameAndPassword(username,password);
        if (userId == -1){
            System.out.println("User Not Found");
            return -1;
        }
        return userId;
    }


    public String getemailByUsernameAndPassword(String username, String password) {
        String email = userepo.getemailByUsernameAndPassword(username, password);
        if (email == null){
            System.out.println("User Not Found");
            return null;
        }
        return email;
    }



    public User getuserProfile(String username) {
        return userepo.findbyUsername(username);
    }

}

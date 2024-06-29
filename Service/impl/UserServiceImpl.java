package Service.impl;

import Model.Restaurant;
import Model.User;
import Repostitiory.impl.UserRepositoryImpl;
import Service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
     UserRepositoryImpl userepo = new UserRepositoryImpl();
    static int userId = 100;

    public boolean signup(String username, String password, String email, String role) {
        User user = new User(userId,username, password, email, role);
        userepo.save(user);
        System.out.println("User Registered");
        System.out.println("Your User Id is : "+userId);
        userId++;
        return true;
    }

    public boolean login(String username, String password){
        User user = userepo.findbyUsername(username);
        if( user != null && user.getPassword().equals(password)) {
            return true;
        }
        System.out.println("Invalid username or password");
        return false;
    }

    @Override
    public List<User> getuserProfile(int userId) {
        List<User> users = userepo.findbyId(userId);
        if(users.isEmpty()){
            System.out.println("user Profile not found");
            return  null;
        }
        return users;
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

    @Override
    public boolean isEmailExist(String email) {
       return userepo.isEmailExist(email);
    }

    @Override
    public String getRoleByUsernameAndPassword(String username, String password) {
        return userepo.getRoleByUsernameAndPassword(username,password);
    }


}

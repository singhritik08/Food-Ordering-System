package Repostitiory.impl;

import Model.Restaurant;
import Model.User;
import Repostitiory.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    List<User> userList = new ArrayList<>();


    public User save(User user) {
        userList.add(user);
        return user;
    }

    public User findbyUsername(String Username){
        for(User user : userList){
            if (user.getUsername().equals(Username)){
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(userList);
    }


    @Override
    public List<User> findbyId(int userId) {

        List<User> profile = new ArrayList<>();
        for(User user : userList){
            if(user.getUserId() == userId){
                profile.add(user);
            }
        }
        return profile;
    }


    @Override
    public int getIdByUsernameAndPassword(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username)  && user.getPassword().equals(password)) {
                return user.getUserId();
            }
        }
        return -1;
    }

    @Override
    public String getemailByUsernameAndPassword(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username)  && user.getPassword().equals(password)) {
                return user.getEmail();
            }
        }
        return null;
    }


}

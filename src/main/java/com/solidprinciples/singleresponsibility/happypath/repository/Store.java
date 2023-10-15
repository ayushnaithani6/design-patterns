package src.main.java.com.solidprinciples.singleresponsibility.happypath.repository;


import src.main.java.com.solidprinciples.singleresponsibility.happypath.data.User;

import java.util.HashMap;
import java.util.Map;

//Stores data in memory
public class Store {

    private static final Map<String, User> STORAGE = new HashMap<>();
    //Adds user to in memory hash map
    public void store(User user) {
        synchronized(STORAGE) {
            STORAGE.put(user.getName(), user);
        }
    }
    //Returns used with given id if present in map else null
    public User getUser(String name) {
        synchronized(STORAGE) {
            return STORAGE.get(name);
        }
    }
}

package src.main.java.com.solidprinciples.singleresponsibility.happypath.repository;

import src.main.java.com.solidprinciples.singleresponsibility.happypath.data.User;
import src.main.java.com.solidprinciples.singleresponsibility.happypath.repository.Store;

public class UserPersistanceService {
    private final Store store = new Store();

    public void saveUser(User user) {
        store.store(user);
    }

}

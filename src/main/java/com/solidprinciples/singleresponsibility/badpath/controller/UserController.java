package src.main.java.com.solidprinciples.singleresponsibility.badpath.controller;

import src.main.java.com.solidprinciples.singleresponsibility.badpath.data.User;
import src.main.java.com.solidprinciples.singleresponsibility.badpath.repository.Store;
import src.main.java.com.solidprinciples.singleresponsibility.badpath.util.ObjectMapper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserController {
    private final Store store = new Store();

    public String createUser(String userJson) {
        // converting Json to POJO
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.fromJson(userJson, User.class);

        // Validating user
        if(!isValidUser(user)) {
            return "ERROR";
        }

        // storing
        store.store(user);

        return "SUCCESS";
    }

    private boolean isValidUser(User user) {
        if(!isPresent(user.getName())) {
            return false;
        }
        user.setName(user.getName().trim());

        if(!isValidAlphaNumeric(user.getName())) {
            return false;
        }
        if(user.getEmail() == null || user.getEmail().trim().length() == 0) {
            return false;
        }
        user.setEmail(user.getEmail().trim());
        return isValidEmail(user.getEmail());
    }

    private boolean isPresent(String value) {
        return value != null && value.trim().length() > 0;
    }

    private boolean isValidAlphaNumeric(String value) {
        Pattern pattern = Pattern.compile("[^A-Za-z]");
        Matcher matcher = pattern.matcher(value);
        return !matcher.find();
    }

    private boolean isValidEmail(String value) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }

}

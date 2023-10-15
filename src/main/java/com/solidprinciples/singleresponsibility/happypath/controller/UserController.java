package src.main.java.com.solidprinciples.singleresponsibility.happypath.controller;

import src.main.java.com.solidprinciples.singleresponsibility.happypath.data.User;
import src.main.java.com.solidprinciples.singleresponsibility.happypath.repository.UserPersistanceService;
import src.main.java.com.solidprinciples.singleresponsibility.happypath.util.ObjectMapper;
import src.main.java.com.solidprinciples.singleresponsibility.happypath.validator.UserValidator;


public class UserController {
    private final UserValidator userValidator = new UserValidator();
    private final UserPersistanceService userPersistanceService = new UserPersistanceService();


    public String createUser(String userJson) {
        // converting Json to POJO
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.fromJson(userJson, User.class);

        // Validating user
        if(!userValidator.isValidUser(user)) {
            return "ERROR";
        }

        // saving
        userPersistanceService.saveUser(user);

        return "SUCCESS";
    }

}

package src.main.java.com.solidprinciples.singleresponsibility.badpath;

import src.main.java.com.solidprinciples.singleresponsibility.badpath.controller.UserController;

// Main class is for testing
public class Main {
    private static final String VALID_USER_JSON =
            "{\"name\": \"ayush\", \"email\": \"naithani@email.com\", \"address\":\"110 delhi india\"}";
    private static final String INVALID_USER_JSON =
            "{\"name\": \"david\", \"email\": \"dav@email\", \"address\":\"111 harvard \"}";

    public static void main(String[] args) {
        UserController controller = new UserController();

        //Check with valid JSON
        String response = controller.createUser(VALID_USER_JSON);
        if(!response.equalsIgnoreCase("SUCCESS")) {
            System.err.println("Failed");
        }
        System.out.println("Valid JSON received response: " + response);

//        Check with invalid JSON
        response = controller.createUser(INVALID_USER_JSON);
        if(!response.equalsIgnoreCase("ERROR")) {
            System.err.println("Failed");
        }
        System.out.println("Invalid JSON received response: " + response);
    }

}

package src.main.java.com.creational.builder.method2;

public class Main {
    public static void main(String[] args) {
        /**
         * Method 2 is mostly used. Constructor is private and UserBuilder is static nested class to User class
         * It is easier to maintain. 
         */
        User user = new User.UserBuilder()
            .withFirstName("Ayush")
            .withLastName("Naithani")
            .withAge(22)
            .withId(1)
            .withUsername("ayushnaithani")
            .build();
        System.out.println(user.toString());
    }
}

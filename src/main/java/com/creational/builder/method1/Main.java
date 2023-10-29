package src.main.java.com.creational.builder.method1;

public class Main {
    public static void main(String[] args) {
        User user = getUser();
        System.out.println(user.toString());
    }

    private static User getUser() {
        return new UserBuilder()
            .withFirstName("Ayush")
            .withLastName("Naithani")
            .withAge(22)
            .withId(1)
            .withUsername("ayushnaithani")
            .build();
    }
}

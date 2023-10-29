package src.main.java.com.creational.builder.method1;

public class UserBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private int id;
    private String username;

    public UserBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public UserBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public User build() {
        String fullName = firstName + " " + lastName; 
        return new User(fullName, age, id, username);
    }
}

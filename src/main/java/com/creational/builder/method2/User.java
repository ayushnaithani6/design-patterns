package src.main.java.com.creational.builder.method2;

public class User {
    private String name;
    private int age;
    private int id;
    private String username;
    
    /**
     * Private Constructor
     * @param name
     * @param age
     * @param id
     * @param username
     */
    private User(String name, int age, int id, String username) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.username = username;
    }

    @Override
    public String toString() {
        return "{ name = " + name 
        + " , age = " + age 
        + " , id = " + id 
        + " , username =  " + username 
        + " }";  
    }

    public static class UserBuilder {
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

    
}

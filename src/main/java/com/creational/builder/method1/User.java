package src.main.java.com.creational.builder.method1;

public class User {
    private String name;
    private int age;
    private int id;
    private String username;
    
    public User(String name, int age, int id, String username) {
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
}

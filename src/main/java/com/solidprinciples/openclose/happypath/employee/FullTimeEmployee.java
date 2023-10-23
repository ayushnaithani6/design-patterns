package src.main.java.com.solidprinciples.openclose.happypath.employee;

public class FullTimeEmployee implements Employee {
    String name;
    double baseSalary;

    public FullTimeEmployee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

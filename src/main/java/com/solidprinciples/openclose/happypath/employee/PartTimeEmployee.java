package src.main.java.com.solidprinciples.openclose.happypath.employee;

public class PartTimeEmployee implements Employee {
    String name;
    double hourlyRate;
    double hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateSalary() {
        // Considering hourly rate and hours worked for part-time employees
        return hourlyRate * hoursWorked;
    }
}

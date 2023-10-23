package src.main.java.com.solidprinciples.openclose.happypath.payrollsystem;

import src.main.java.com.solidprinciples.openclose.happypath.employee.Employee;

public class PayrollSystem {
    public double calculateSalary(Employee employee) {
        return employee.calculateSalary();
    }
}

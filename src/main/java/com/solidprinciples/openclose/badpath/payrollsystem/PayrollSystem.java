package src.main.java.com.solidprinciples.openclose.badpath.payrollsystem;

import src.main.java.com.solidprinciples.openclose.badpath.employee.Employee;

public class PayrollSystem {
    public double calculateSalary(Employee employee) {
        // Basic calculation, no bonuses or special cases considered
        return employee.getSalary();
    }
}

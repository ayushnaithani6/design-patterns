package src.main.java.com.solidprinciples.openclose.happypath;

import src.main.java.com.solidprinciples.openclose.happypath.payrollsystem.PayrollSystem;
import src.main.java.com.solidprinciples.openclose.happypath.employee.Employee;
import src.main.java.com.solidprinciples.openclose.happypath.employee.FullTimeEmployee;
import src.main.java.com.solidprinciples.openclose.happypath.employee.PartTimeEmployee;

/**
 * In this good scenario, the Employee interface is open for extension.
 * You can add new types of employees (e.g., PartTimeEmployee) without modifying the PayrollSystem class.
 * The PayrollSystem depends on the abstraction provided by the Employee interface and its concrete implementations.
 */
public class Main {
    private static final PayrollSystem payrollSystem = new PayrollSystem();
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("TEST_USER_1", 1000.00);
        System.out.println(fullTimeEmployee.getName() + " " + fullTimeEmployee.calculateSalary());
        System.out.println(payrollSystem.calculateSalary(fullTimeEmployee));

        Employee partTimeEmployee = new PartTimeEmployee("TEST_USER_2", 12.00, 12.00);
        System.out.println(partTimeEmployee.getName() + " " + partTimeEmployee.calculateSalary());
        System.out.println(payrollSystem.calculateSalary(partTimeEmployee));

    }
}

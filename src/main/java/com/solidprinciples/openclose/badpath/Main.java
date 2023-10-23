package src.main.java.com.solidprinciples.openclose.badpath;

import src.main.java.com.solidprinciples.openclose.badpath.employee.Employee;
import src.main.java.com.solidprinciples.openclose.badpath.payrollsystem.PayrollSystem;

/** In this bad scenario, if you want to introduce bonuses or handle different types of employees (e.g., full-time, part-time),
 * you might be tempted to modify the PayrollSystem class. This violates the Open-Closed Principle.
 **/
public class Main {
    private static final PayrollSystem payrollSystem = new PayrollSystem();
    public static void main(String[] args) {
        Employee fullTimeEmployee1 = new Employee("TEST_USER_1", 1000.0);
        payrollSystem.calculateSalary(fullTimeEmployee1);

        // Let's say we want to add another employee put it is part-time employee and for that we need to add bonus component as well.
        // we have to change calculateSalary method everytime we have new condition
        // Also we need to add another attribute to Employee class to consider bonus or any additional component
        // depending on type of Employee.

        // This is bad design.

        // We will have to add new constructor for new type of employee for new attribute
        // 50.00 - bonus
        // Employee partTimeEmployee = new Employee("TEST_USER_2", 100.00, 50.00);

    }
}

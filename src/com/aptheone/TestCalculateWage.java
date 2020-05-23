package com.aptheone;

public class TestCalculateWage {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 50);
        double wage = employee.calculateWage(10);
        Employee.printNumberOfEmployees();
        System.out.println("Wage of Employee : " + wage);
    }
}

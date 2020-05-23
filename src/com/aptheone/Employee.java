package com.aptheone;

public class Employee {

    private static int numberOfEmployees;
    
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public Employee(int baseSalary) {
        this(baseSalary,0);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        System.out.println("Number Of Employees :"+numberOfEmployees);
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("The base salary should be greater than Zero.");
        }
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("The hourly rate should be greater than Zero.");
        }
        this.hourlyRate = hourlyRate;
    }

    public double calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public double calculateWage() {
        return calculateWage(0);
    }
}

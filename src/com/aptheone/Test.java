package com.aptheone;

public class Test {

    public static void main(String[] args) {
        int baseSalary = 50_000;
        int hourlyRate = 50;
        float extraHours = 10;

        double wage = calculateWage(baseSalary, hourlyRate, extraHours);
        System.out.println("Wage of Employee : " + wage);
    }

    private static double calculateWage(int baseSalary, int hourlyRate, float extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}

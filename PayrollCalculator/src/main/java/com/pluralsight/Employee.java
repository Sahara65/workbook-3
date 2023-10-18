package com.pluralsight;


import java.io.BufferedInputStream;
import java.io.FileReader;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeID, String employeeName, double employeeHours, double employeePayRate) {
        this.employeeId = employeeID;
        this.name = employeeName;
        this.hoursWorked = employeeHours;
        this.payRate = employeePayRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay(){
        return payRate;
    }
}
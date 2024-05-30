package com.giri.j059;

public class Employee {
    private int empId;
    private String empName;
    private String designation;
    private double salary;


    public Employee(int empId, String empName, String designation, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Designation: " + designation);
        System.out.println("Employee Salary: $" + salary);
        System.out.println();
    }
}

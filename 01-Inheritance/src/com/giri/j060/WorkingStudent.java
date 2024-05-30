package com.giri.j060;

import javax.sound.midi.Soundbank;

public class WorkingStudent extends Person implements Employee, Student{
    private int employeeId;
    private String designation;
    private double salary;
    private int studentId;
    private String course;

    public WorkingStudent(String name, int age, int employeeId, String designation, double salary, int studentId, String course) {
        super(name, age);
        this.employeeId = employeeId;
        this.designation = designation;
        this.salary = salary;
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getDesignation() {
        return designation;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void employeeDetails() {
        System.out.println("Employee Id: "+ employeeId);
        System.out.println("Designation: "+ designation);
        System.out.println("Salary: "+ salary);
    }

    @Override
    public int getStudentId() {
        return studentId;
    }

    @Override
    public String getCourse() {
        return course;
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("Student Id: "+ studentId);
        System.out.println("Course: "+ course);
    }

    public void displayAllDetails(){
        displayDetails();
        displayStudentDetails();
        employeeDetails();
    }
}

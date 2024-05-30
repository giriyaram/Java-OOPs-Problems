package com.giri.j059;

public class Main {
    public static void main(String[] args) {

        SoftwareCompany employee1 = new SoftwareCompany(101, "Giri", "FullStack Developer", 45000);
        SoftwareCompany employee2 = new SoftwareCompany(102, "Praneeth", "Data Engineer", 55000);
        SoftwareCompany employee3 = new SoftwareCompany(103, "Rishi", "Frontend Developer", 47000);
        SoftwareCompany employee4 = new SoftwareCompany(104, "Hashwanth", "Backend Developer", 45500);
        SoftwareCompany employee5 = new SoftwareCompany(105, "Shiva", "Machine Learning Engineer", 62000);

        employee1.displayEmployeeDetails();
        employee2.displayEmployeeDetails();
        employee3.displayEmployeeDetails();
        employee4.displayEmployeeDetails();
        employee5.displayEmployeeDetails();



    }
}

package com.giri.j057;

//J057.Create a java application where we have a bank it will provide customer details like account number, ifsc code,
//atm pin, and available balance to a customer then customer has to display all the values by using a user defined method
//and then invoke this method under main method by providing dynamic inputs.

public class Bank {

    long accountNumber;
    String ifscCode;
    int pin;
    double avlBalence;
    public Bank(long accountNumber, String ifscCode, int pin, double avlBalence) {
        super();
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.pin = pin;
        this.avlBalence = avlBalence;
    }

    public void display() {
        System.out.println("accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", pin=" + pin + ", avlBalence="
                + avlBalence );
    }
}

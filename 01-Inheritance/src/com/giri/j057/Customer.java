package com.giri.j057;

public class Customer extends Bank{
    public Customer(long accountNumber, String ifscCode, int pin, double avlBalence) {
        super(accountNumber, ifscCode, pin, avlBalence);
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {

        Customer giri = new Customer(4574564, "SBI1057", 2142, 250000 );

        giri.display();
    }
}

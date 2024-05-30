package com.giri.j058;

public class Customer {
    private RetailMarket mobile;

    public Customer(RetailMarket mobile) {
        this.mobile = mobile;
    }

    public void purchase(){
        System.out.println("Customer has purchased the mobile with following specifications");
        mobile.displaySpecs();
    }
}

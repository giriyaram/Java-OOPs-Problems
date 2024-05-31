package com.giri.j062;

public class BaseClass {

    public boolean m1(String input) {
        System.out.println("BaseClass m1: " + input);
        return input != null && !input.isEmpty();

    }
}
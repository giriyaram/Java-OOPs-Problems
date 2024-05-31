package com.giri.j062;

public class DerivedClass extends IntermediateClass{
    @Override
    public boolean m1(String input){
        System.out.println("DerievedClass m1: "+input);
        boolean result = super.m1(input);
        return result && input.contains("Java");
    }
}

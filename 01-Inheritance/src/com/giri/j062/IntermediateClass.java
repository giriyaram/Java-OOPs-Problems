package com.giri.j062;

public class IntermediateClass extends BaseClass {
    @Override
    public boolean m1(String input){
        System.out.println("Intermediate class m1: "+ input);
        boolean result = super.m1(input);
        return result && input.length() > 5;
    }

}

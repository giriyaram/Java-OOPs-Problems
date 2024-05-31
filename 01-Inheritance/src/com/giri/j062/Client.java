package com.giri.j062;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        DerivedClass derived = new DerivedClass();
        boolean result = derived.m1(userInput);

        System.out.println("Final result: "+result);

        scanner.close();
    }
}

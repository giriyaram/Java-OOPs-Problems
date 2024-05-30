package com.giri.j058;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();

        System.out.println("Enter ram: ");
        String ram = scanner.nextLine();

        System.out.println("Enter rom: ");
        String rom = scanner.nextLine();

        System.out.println("Enter processor: ");
        String processor = scanner.nextLine();

        System.out.println("Enter camera: ");
        String camera = scanner.nextLine();

        System.out.println("Enter os: ");
        String os = scanner.nextLine();

        System.out.println("Enter battery: ");
        String battery = scanner.nextLine();

        System.out.println("Enter price: ");
        double price = scanner.nextDouble();

        Mobile manufactoredMobile = new Mobile(brand, ram,rom, camera,processor,os, battery, price);

        WholesSaleMarket wholeSaleMobile = new WholesSaleMarket(brand, ram,rom, camera,processor,os, battery, manufactoredMobile.getPrice());

        RetailMarket retailMobile = new RetailMarket(brand, ram,rom, camera,processor,os, battery, wholeSaleMobile.getPrice());

        Customer giri = new Customer(retailMobile);

        giri.purchase();

        scanner.close();
    }
}

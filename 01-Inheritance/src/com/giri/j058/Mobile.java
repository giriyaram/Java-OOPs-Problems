package com.giri.j058;

public class Mobile {
    private String brand;
    private String ram;
    private String rom;
    private String camera;
    private String processor;
    private String os;
    private String battery;
    private double price;


    public Mobile(String brand, String ram, String rom, String camera, String processor, String os, String battery, double price) {
        this.brand = brand;
        this.ram = ram;
        this.rom = rom;
        this.camera = camera;
        this.processor = processor;
        this.os = os;
        this.battery = battery;
        this.price = price;
    }

    public void increasePriceByPercentage(double percentage){
        this.price += this.price * (percentage/100);
    }

    public double getPrice(){
       return this.price = this.price;
    }


    public void displaySpecs() {
        System.out.println("Mobile{" +
                "brand='" + brand + '\'' +
                ", ram='" + ram + '\'' +
                ", rom='" + rom + '\'' +
                ", camera='" + camera + '\'' +
                ", processor='" + processor + '\'' +
                ", os='" + os + '\'' +
                ", battery='" + battery + '\'' +
                ", price=" + price + "}");
    }
}

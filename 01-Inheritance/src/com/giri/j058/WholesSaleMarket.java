package com.giri.j058;

public class WholesSaleMarket extends Mobile {


    public WholesSaleMarket(String brand, String ram, String rom, String camera, String processor, String os, String battery, double price) {
        super(brand, ram, rom, camera, processor, os, battery, price);
        increasePriceByPercentage(10);
    }
}

package com.giri.j058;

public class RetailMarket extends WholesSaleMarket{
    public RetailMarket(String brand, String ram, String rom, String camera, String processor, String os, String battery, double price) {
        super(brand, ram, rom, camera, processor, os, battery, price);
        increasePriceByPercentage(10);
    }
}

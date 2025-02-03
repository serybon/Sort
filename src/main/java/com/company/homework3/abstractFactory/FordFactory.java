package com.company.homework3.abstractFactory;

public class FordFactory implements CarsFactory{

    @Override
    public Suv createSuv() {
        return new FordSuv();
    }

    @Override
    public Pickup createPickup() {
        return new FordPickup();
    }
}

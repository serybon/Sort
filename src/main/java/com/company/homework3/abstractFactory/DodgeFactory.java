package com.company.homework3.abstractFactory;

public class DodgeFactory implements CarsFactory{

    @Override
    public Suv createSuv() {
        return new DodgeSuv();
    }

    @Override
    public Pickup createPickup() {
        return new DodgePickup();
    }
}

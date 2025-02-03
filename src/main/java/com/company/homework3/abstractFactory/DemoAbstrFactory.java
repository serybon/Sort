package com.company.homework3.abstractFactory;

public class DemoAbstrFactory {
    public static void main(String[] args) {
        CarsFactory carsFactory = new DodgeFactory();
        carsFactory.createPickup().getDescription();
        carsFactory.createSuv().getDescription();

        CarsFactory carsFactory1 = new FordFactory();
        carsFactory1.createPickup().getDescription();
        carsFactory1.createSuv().getDescription();
    }
}

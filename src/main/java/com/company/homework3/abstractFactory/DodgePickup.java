package com.company.homework3.abstractFactory;

public class DodgePickup implements Pickup{
    @Override
    public void getDescription() {
        System.out.println("Dodge pickup");
    }
}

package com.company.homework3.decoratorPattern;

public class Blin extends Base {

    public Blin() {
        info = "Blin";
    }

    @Override
    public double cost() {
        return 10;
    }
}


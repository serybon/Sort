package com.company.homework3.decoratorPattern;

public class Salmon extends AdditiveToBase{

    public Salmon(Base base) {
        this.base = base;
    }

    @Override
    public String getInfo() {
        return base.getInfo() + " + Salmon";
    }

    @Override
    public double cost() {
        return base.cost() + 50;
    }
}

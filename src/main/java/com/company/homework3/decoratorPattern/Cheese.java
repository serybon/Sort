package com.company.homework3.decoratorPattern;

public class Cheese extends AdditiveToBase{
    public Cheese(Base base) {
        this.base = base;
    }

    @Override
    public String getInfo() {
        return base.getInfo() + " + Cheese";
    }

    @Override
    public double cost() {
        return base.cost() + 25;
    }
}

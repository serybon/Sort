package com.company.homework3.decoratorPattern;

public class Pita extends Base {

    public Pita(){
        info = "Pita";
    }
    @Override
    public double cost() {
        return 15;
    }
}

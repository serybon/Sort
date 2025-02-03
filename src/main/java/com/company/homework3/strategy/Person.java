package com.company.homework3.strategy;

public abstract class Person implements Activity{

    public void Eating(){
        System.out.println("Человек ест...");
    }

    public void Sleeping(){
        System.out.println("Человек спит...");
    }

    public void Breathing(){
        System.out.println("Человек дышит...");
    }

}

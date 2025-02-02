package com.company.homework3.decoratorPattern;

public class StreetFoodTrailer {
    public static void main(String[] args) {
        Base order1 = new Salmon(new Salmon(new Salmon(new Blin())));
        Base order2 = new Cheese(new Salmon(new Pita()));

        System.out.println("Order: " + order1.getInfo() + ". Price: " + order1.cost() + " rub");
        System.out.println("Order: " + order2.getInfo() + ". Price: " + order2.cost() + " rub");

    }
}

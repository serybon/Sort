package com.company.homework3.strategy;

public class DemoStrategy {
    public static void main(String[] args) {
        ActivePerson activePerson = new ActivePerson();
        activePerson.setActivity(new Coding());
        activePerson.Do();
        activePerson.Eating();
        activePerson.setActivity(new PlayChess());
        activePerson.Do();

    }
}

package com.company.homework3.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){};

    public static Singleton getInstance(){
        if(Singleton.instance == null){
            return new Singleton();
        }
        return instance;
    }
}

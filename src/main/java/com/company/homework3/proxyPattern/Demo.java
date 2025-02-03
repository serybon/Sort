package com.company.homework3.proxyPattern;

public class Demo {
    public static void main(String[] args) {
        ProxyTextFile file = new ProxyTextFile("D:\\java\\data.txt");
        file.display();
        file.display();
    }
}

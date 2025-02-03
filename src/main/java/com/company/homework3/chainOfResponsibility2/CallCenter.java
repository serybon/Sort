package com.company.homework3.chainOfResponsibility2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CallCenter {
    public static void main(String[] args) {

        Call call = new Call("+131313313113");

        List<Handler> handles = Arrays.asList(
                new Operator("Operator 1"),
                new Operator("Operator 2"),
                new Operator("Operator 3"),
                new Operator("Operator 4"),
                new Operator("Operator 5"),
                new Operator("Operator 6"),
                new Operator("Operator 7")
        );

        handles.stream().map(handler -> {
            handler.handle(call);
            return handler;
        }).count();
    }
}
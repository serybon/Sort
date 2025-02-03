package com.company.homework3.chainOfResponsibilityPattern;

public class CallCenter {
    public static void main(String[] args) {
        Handler handler = new Repeater();
         handler.bind(new Operator("Operator 1"))
                .bind(new Operator("Operator 2"))
                .bind(new Operator("Operator 3"))
                .bind(new Operator("Operator 4"))
                .bind(new Operator("Operator 5"))
                .bind(new Operator("Operator 6"))
                .bind(new Operator("Operator 7"))
                .bind(handler);
        Call call = new Call("+131313313113");
        handler.handle(call);
    }
}

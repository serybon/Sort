package com.company.homework3.chainOfResponsibilityPattern;

public class Operator extends Handler {
    final private String name;

    public Operator(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void handle(Call call) {
        if (isBusyNow()){
            System.out.printf("В данный момент %s занят. Передаю входящий по цепочке" + '\n',getName());
            super.handle(call);
        }else {
            System.out.printf("Входящий звонок с номером %s обработан %s",call.getIncomingNumber(),getName());
        }
    }
    public boolean isBusyNow() {
        return Math.random() < 0.90;
    }
}

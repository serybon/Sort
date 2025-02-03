package com.company.homework3.chainOfResponsibilityPattern;

public class Repeater extends Handler{
    private Call call;

    public Repeater(Call call) {
        this.call = call;
    }

    public Repeater() {
    }

    @Override
    public void handle(Call call) {
        if(this.call == call){
            System.out.println("Все операторы заняты. Ваше место в очереди - один :) ");

        } else this.call = call;
        super.handle(call);
    }
}

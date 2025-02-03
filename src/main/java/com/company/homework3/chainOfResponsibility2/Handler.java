package com.company.homework3.chainOfResponsibility2;

public abstract class Handler {
    private Handler nextHandler;

    public void handle(Call call) {
        if (nextHandler != null) {
            nextHandler.handle(call);
        }
    }
    public Handler bind(Handler nextHandler){
        this.nextHandler = nextHandler;
        return nextHandler;
    }
}

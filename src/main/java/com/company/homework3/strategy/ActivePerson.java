package com.company.homework3.strategy;

public class ActivePerson extends Person{
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void Do() {
        activity.Do();
    }
}

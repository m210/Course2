package com.company.Lesson1;

public class ServiceStation {

    public void check(Vehicle obj) {
        if(obj == null)
            return;

        System.out.println("Обслуживаем " + obj.getModelName());
        obj.check();
    }
}

package com.company.Lesson1;

public class ServiceStation {

    public void check(Mover obj) {
        if(obj == null)
            return;

        System.out.println("Обслуживаем " + obj.getModelName());
        for (int i = 0; i < obj.getWheelsCount(); i++)
            obj.updateTyre();
        obj.checkEngine();
        obj.checkTrailer();
    }

    // Без интерфейса:
//    public void check(Bicycle obj) {
//        if(obj == null)
//            return;
//
//        System.out.println("Обслуживаем " + obj.getModelName());
//        for (int i = 0; i < obj.getWheelsCount(); i++)
//            obj.updateTyre();
//        if(!obj.getClass().equals(Bicycle.class))
//            ((Car) obj).checkEngine();
//        if(obj.getClass().equals(Truck.class))
//            ((Truck) obj).checkTrailer();
//    }
}

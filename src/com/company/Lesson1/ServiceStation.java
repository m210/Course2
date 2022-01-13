package com.company.Lesson1;

public class ServiceStation {

    public void checkVehicle (Bicycle obj) {
        if(obj == null)
            return;

        System.out.println("Обслуживаем " + obj.getModelName());
        if(obj instanceof Truck)
            check((Truck) obj);
        else if(obj instanceof Car)
            check((Car) obj);
        else check(obj);
    }

    public void check (Bicycle obj) {
        if(obj == null)
            return;

        for (int i = 0; i < obj.getWheelsCount(); i++)
            obj.updateTyre();
    }

    public void check (Car obj) {
        if(obj == null)
            return;

        check((Bicycle) obj);
        obj.checkEngine();
    }

    public void check (Truck obj) {
        if(obj == null)
            return;

        check((Car) obj);
        obj.checkTrailer();
    }
}

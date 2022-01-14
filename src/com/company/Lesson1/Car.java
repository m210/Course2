package com.company.Lesson1;

public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    // Можно было бы, конечно, унаследоваться от Велосипеда, тогда не пришлось бы дублировать этот код :)
    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        for(int i = 0; i < getWheelsCount(); i++)
            updateTyre();
        checkEngine();
    }
}

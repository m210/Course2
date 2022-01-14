package com.company.Lesson1;

public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        for(int i = 0; i < getWheelsCount(); i++)
            updateTyre();
    }

}

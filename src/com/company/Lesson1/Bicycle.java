package com.company.Lesson1;

public class Bicycle implements Mover {

    private final String modelName;
    private final int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}

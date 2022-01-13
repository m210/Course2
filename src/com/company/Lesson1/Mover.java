package com.company.Lesson1;

public interface Mover {

    String getModelName();

    int getWheelsCount();

    void updateTyre();

    default void checkEngine() {
    }

    default void checkTrailer() {
    }
}

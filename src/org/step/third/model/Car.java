package org.step.third.model;

import org.step.third.model.engine.Engine;

public abstract class Car<T extends Engine> {

    private String type;
    private double power;
    private T typeOfEngine;

    public Car(String type, double power) {
        this.type = type;
        this.power = power;
    }

    public boolean isTheSameType(Car<T> car) {
        return true;
    }

    public boolean isTheSameExactly(Car<?> car) {
        return false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public T getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(T typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }
}

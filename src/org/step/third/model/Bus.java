package org.step.third.model;

import org.step.third.model.engine.Engine;

public class Bus<T extends Engine> extends Car<T> {

    public Bus(String type, double power) {
        super(type, power);
    }
}
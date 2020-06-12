package org.step.third.classes;

public class Runner {

    public static void main(String[] args) {
        int zero = Car.Engine.ZERO;

        Car car = new Car("asd", "ads", 123.2);

        Car.Engine engine = car.new Engine();

        Car.Engine secondEdition = new Car("asd", "sad", 23.2).new Engine();

        Car.Wheel wheel = new Car.Wheel();

        engine.chipEngine();
    }
}

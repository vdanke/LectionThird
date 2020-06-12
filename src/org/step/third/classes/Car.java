package org.step.third.classes;

public class Car {

    private final String engineType;
    private final String bodyType;
    private final double wheelDiameter;

    Engine engine = new Engine();
    Wheel wheel = new Wheel();

    public Car(String engineType, String bodyType, double wheelDiameter) {
        this.engineType = engineType;
        this.bodyType = bodyType;
        this.wheelDiameter = wheelDiameter;
    }

    class Engine {

        public static final int ZERO = 0;

        public String chipEngine() {
            String engineType = Car.this.engineType;

            return Car.this.engineType + " Chip success";
        }
    }

    static class Wheel {

        public void someMethod() {
            Car car = new Car("asd", "asd", 123.2);
            String engineType = car.engineType;
        }
    }

    class Body {

    }
}

package org.step.third;

import org.step.third.model.Bus;
import org.step.third.model.Car;
import org.step.third.model.engine.DVSEngine;
import org.step.third.model.engine.ElectricEngine;
import org.step.third.model.engine.Engine;

public class Runner {

    public static void main(String[] args) {
        Car<DVSEngine> electricEngineCar = new Bus<>("Bus", 123.2);

        electricEngineCar.setTypeOfEngine(new DVSEngine("This DVC work flow"));

        System.out.println(electricEngineCar.getType());
        System.out.println(electricEngineCar.getTypeOfEngine().getClass().getSimpleName());
        System.out.println(electricEngineCar.getTypeOfEngine().getWorkFlow());

        Car<DVSEngine> bus = new Bus<>("Bus", 123.2);
        Car<ElectricEngine> electricEngineCar1 = new Bus<>("Bus", 121.2);

        Car<Engine> car = new Bus<>("Bus", 123.2);

//        car.isTheSameType(electricEngineCar1);

//        car.isTheSameExactly(electricEngineCar1);
    }
}

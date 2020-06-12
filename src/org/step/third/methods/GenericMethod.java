package org.step.third.methods;

import org.step.third.model.Bus;
import org.step.third.model.engine.DVSEngine;
import org.step.third.model.engine.ElectricEngine;
import org.step.third.model.engine.Engine;

public class GenericMethod {

    public static <T extends Engine> boolean checkEngine(T num) {
        boolean isForm = num.getClass().isAssignableFrom(ElectricEngine.class);

        if (isForm) {
            System.out.println("Getting electric engine power bigger");
        } else {
            System.out.println("Getting fuel is less expensive");
        }
        return isForm;
    }

    public static void main(String[] args) {
//        System.out.println(asByte("123"));
//        System.out.println(asByte(new Bus<>("asd", 123.2)));
        System.out.println(checkEngine(new ElectricEngine("Good")));

        Status status = Status.ACTIVE;

        System.out.println(Status.ACTIVE.name());

        Status[] values = Status.values();

        Status active = Status.valueOf("ACTIVE");

        System.out.println(Status.ACTIVE.ordinal());
    }
}

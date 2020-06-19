package org.step.eights.optional;

public class Realization implements CustomFunctionalInterface<String, Integer> {

    @Override
    public String transform(Integer integer) {
        return integer.toString();
    }
}

package org.step.first;

import org.step.first.model.SumParamObject;

public class Son extends ParseNumbers {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("name");

        getFirst(name);

        System.out.println(name.toString());
    }

    private static StringBuilder getFirst(StringBuilder name) {
        name.append("first ");
        return getSecond(name);
    }

    private static StringBuilder getSecond(StringBuilder name) {
        name.append("second ");
        return name;
    }

    private static int getSum(SumParamObject paramObject) {
        return 0;
    }
}

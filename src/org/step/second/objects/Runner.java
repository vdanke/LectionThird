package org.step.second.objects;

import java.util.HashSet;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
        Set<ObjectExample> objectExamples = new HashSet<>();

        ObjectExample firstObject = new ObjectExample("FirstObject", 135);
        ObjectExample secondObject = new ObjectExample("SecondObject", 147);
        ObjectExample thirdObject = new ObjectExample("FirstObject", 135);

        objectExamples.add(firstObject);
        objectExamples.add(secondObject);
        objectExamples.add(thirdObject);
        objectExamples.add(firstObject);
        objectExamples.add(secondObject);
        objectExamples.add(firstObject);
        objectExamples.add(secondObject);
        objectExamples.add(thirdObject);
        objectExamples.add(firstObject);
        objectExamples.add(secondObject);
        objectExamples.add(firstObject);
        objectExamples.add(secondObject);
        objectExamples.add(thirdObject);
        objectExamples.add(firstObject);
        objectExamples.add(secondObject);

        System.out.println(firstObject.hashCode());
        System.out.println(secondObject.hashCode());
        System.out.println(thirdObject.hashCode());

        boolean isTheSame = firstObject.equals(secondObject);
        boolean isTheSameTwo = firstObject.equals(thirdObject);
        boolean isTheSameThree = secondObject.equals(thirdObject);

        System.out.println(isTheSame);
        System.out.println(isTheSameTwo);
        System.out.println(isTheSameThree);

        System.out.println(objectExamples.size());
    }
}

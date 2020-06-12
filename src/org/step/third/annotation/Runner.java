package org.step.third.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Runner {

    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        Field[] declaredFields = programmer.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            field.setAccessible(true);
            boolean annotationPresent = field.isAnnotationPresent(OurPeople.class);

            if (annotationPresent) {
                OurPeople annotation = field.getAnnotation(OurPeople.class);

                String value = annotation.value();

                try {
                    field.set(programmer, value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(programmer.getSomeText());
    }
}

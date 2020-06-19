package org.step.eights.lambda;

import org.step.third.annotation.OurPeople;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class LambdaExample {

    public String[] sort(String[] array, Comparator<String> comparator) {
        Arrays.sort(array, comparator);
        return array;
    }

    public static void main(String[] args) {
        LambdaExample lambdaExample = new LambdaExample();
        CustomComparator customComparator = new CustomComparator();

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                return first.length() - second.length();
            }
        };

        Runnable runnable = () -> System.out.println("YO");
        Thread thread = new Thread(runnable);
        thread.start();

        Comparator<String> stringComparator = (final String first, @OurPeople String second) -> first.length() - second.length();

        Comparator<String> modifiedComparator = (first, second) -> Integer.compare(first.length(), second.length());

        String[] array = new String[]{"asd", "s", "asdqwe", "dsqwekwjhafjaw", "ds", "q"};

        Function<String, Integer> function = String::length;

        String[] sort = lambdaExample.sort(array, Comparator.comparingInt(String::length));

        for (String s : sort) {
            System.out.println(s);
        }
    }
}

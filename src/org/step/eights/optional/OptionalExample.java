package org.step.eights.optional;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OptionalExample {

    private final Map<Integer, String> integerStringMap;

    public OptionalExample(Map<Integer, String> integerStringMap) {
        integerStringMap.put(1, "First");
        integerStringMap.put(5, "Fifth");
        this.integerStringMap = integerStringMap;
    }

    public void test(String str) {
        Optional<String> stringOptional = Optional.of(integerStringMap.get(1));

        Optional<String> nullableOptional = Optional.ofNullable(integerStringMap.get(5));

        boolean isPresent = nullableOptional.isPresent();

        String sp = nullableOptional.isPresent() ? nullableOptional.get() : "Default";
        String aDefault = nullableOptional.orElse("Default");

        System.out.println(aDefault);

        Predicate<String> stringPredicate = new Predicate<String>() {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("switch");
            @Override
            public boolean test(String s) {
                return s.length() > Integer.parseInt(resourceBundle.getString("switch"));
            }
        };
        Predicate<String> lambdaPredicate = s -> s.length() > 5;
        Optional<String> optional = nullableOptional.filter(lambdaPredicate);
        System.out.println(optional.isPresent());

        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + " with Consumer");
            }
        };
        nullableOptional.ifPresent(stringConsumer);

        Function<String, Integer> stringIntegerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Optional<Integer> integer = nullableOptional.map(stringIntegerFunction);

//        Supplier<String> stringSupplier = new Supplier<String>() {
//            @Override
//            public String get() {
//                return "";
//            }
//        };
//        Supplier<String> supplier = () -> "Default";
        nullableOptional.orElseGet(() -> "");

        Optional<Object> o = Optional.ofNullable(null);

//        Supplier<OptionalException> optionalExceptionSupplier = new Supplier<OptionalException>() {
//            @Override
//            public OptionalException get() {
//                return new OptionalException("This is exception");
//            }
//        };
        o.orElseThrow(() -> new OptionalException("Good"));

        boolean equals = str.equals(aDefault);

        if (isPresent) {
            String nullableString = nullableOptional.get();
            System.out.println(nullableString);
        } else {
            System.out.println("User not found");
        }
    }

    public static void main(String[] args) {
        OptionalExample optionalExample = new OptionalExample(new HashMap<>());

        optionalExample.test("null");

        Realization realization = new Realization();

        String something = realization.getSomething(1);

        System.out.println(something);

        String somethingStatic = CustomFunctionalInterface.getSomethingStatic(1);

        System.out.println(somethingStatic);

        CustomFunctionalInterface<String, Integer> customFunctionalInterface = (number) -> number.toString();
    }
}

package org.step.eights.optional;

@FunctionalInterface
public interface CustomFunctionalInterface<T, F> {

    T transform(F f);

    @SuppressWarnings("unchecked")
    default T getSomething(F f) {
        return  (T) f.toString();
    }

    @SuppressWarnings("unchecked")
    static <T extends String, F extends Number> T getSomethingStatic(F f) {
        return (T) f.toString();
    }
}

package org.step.seventh.exampl;

public class Runner {

    public static void main(String[] args) {
        factory(new Admin()).talk();
    }

    private static <T extends UserService> T factory(T t) {
        if (t.getClass().isAssignableFrom(Admin.class)) {
            return (T) t;
        }
        if (t.getClass().isAssignableFrom(Person.class)) {
            return (T) t;
        }
        if (t.getClass().isAssignableFrom(Dummy.class)) {
            return (T) t;
        }
        return null;
    }
}

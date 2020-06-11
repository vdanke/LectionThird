package org.step.second.classes;

public class SecondImpl extends AbstractClass {

    public SecondImpl(String example) {
        super(example);
    }

    @Override
    public void printExample() {
        System.out.println(super.getExample());
    }

    @Override
    public void printIAMGOOD() {
        System.out.println(super.getExample() + super.getClass().getSimpleName());
    }

    @Override
    public String getExample() {
        return "new string";
    }

    public String getExample(int i) {
        return String.valueOf(i);
    }
}

package org.step.second.classes;

public class AbstractClassImpl extends AbstractClass {

    private int number;

    public AbstractClassImpl(String example, int number) {
        super(example);
        this.number = number;
    }

    @Override
    public void printIAMGOOD() {
        System.out.println(this.getExample() + this.getClass().getSimpleName());
    }

    @Override
    public void printExample() {
        System.out.println(super.getExample() + super.getClass().getSimpleName());
    }
}

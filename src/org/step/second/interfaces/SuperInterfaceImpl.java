package org.step.second.interfaces;

public class SuperInterfaceImpl implements SuperInterface {

    @Override
    public void printSomething() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public String getSomething() {
        return this.getClass().getSimpleName();
    }
}

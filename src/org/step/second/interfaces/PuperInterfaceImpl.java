package org.step.second.interfaces;

public class PuperInterfaceImpl implements SuperInterface {

    @Override
    public void printSomething() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public String getSomething() {
        return this.getClass().getSimpleName();
    }
}

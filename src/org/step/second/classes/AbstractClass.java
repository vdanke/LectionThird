package org.step.second.classes;

public abstract class AbstractClass implements GoodInterface {

    private String example;

    public AbstractClass(String example) {
        this.example = example;
    }

    public abstract void printExample();

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}

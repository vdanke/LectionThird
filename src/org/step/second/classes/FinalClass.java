package org.step.second.classes;

public final class FinalClass {

    private final String example;

    public FinalClass() {
        this.example = "default";
    }

    public FinalClass(String example) {
        this.example = example;
    }

    public final void printExample() {
        System.out.println(example);
    }

    public String getExample() {
        return example;
    }
}

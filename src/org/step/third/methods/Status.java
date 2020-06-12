package org.step.third.methods;

public enum Status {

    ACTIVE("This is active definition", 0), PAUSED("This is paused status", 1);

    private String definition;
    private int number;

    Status(String definition, int number) {
        this.definition = definition;
        this.number = number;
    }

    public String getDefinition() {
        return definition;
    }
}

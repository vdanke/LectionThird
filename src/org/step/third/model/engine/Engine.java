package org.step.third.model.engine;

public abstract class Engine {

    protected String workFlow;

    public Engine(String workFlow) {
        this.workFlow = workFlow;
    }

    public String getWorkFlow() {
        return workFlow;
    }

    public void setWorkFlow(String workFlow) {
        this.workFlow = workFlow;
    }
}

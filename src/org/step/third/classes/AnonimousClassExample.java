package org.step.third.classes;

import org.step.third.model.engine.DVSEngine;

public class AnonimousClassExample {

    public static void main(String[] args) {
        DVSEngine dvsEngine = new DVSEngine("Work flow") {
            @Override
            public void setWorkFlow(String workFlow) {
                super.setWorkFlow(workFlow);
            }
        };

        dvsEngine.setWorkFlow("new Work Flow");

        System.out.println(dvsEngine.getWorkFlow());
    }
}

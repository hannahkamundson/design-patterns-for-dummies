package patterns.strategy.vehicle;

import patterns.strategy.go.GoAlgorithm;

public abstract class Vehicle {
    private GoAlgorithm goAlgorithm;

    public void setGoAlgorithm(GoAlgorithm algorithm) {
        goAlgorithm = algorithm;
    }

    public void go() {
        goAlgorithm.go();
    }
}

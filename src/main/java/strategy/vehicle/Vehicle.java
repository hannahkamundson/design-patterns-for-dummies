package strategy.vehicle;

import strategy.go.GoAlgorithm;

public abstract class Vehicle {
    private GoAlgorithm goAlgorithm;

    public void setGoAlgorithm(GoAlgorithm algorithm) {
        goAlgorithm = algorithm;
    }

    public void go() {
        goAlgorithm.go();
    }
}

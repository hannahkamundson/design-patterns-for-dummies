package patterns.strategy.vehicle;

import patterns.strategy.go.GoByFlyingAlgorithm;

public class Helicopter extends Vehicle {
    public Helicopter() {
        setGoAlgorithm(new GoByFlyingAlgorithm());
    }
}

package strategy.vehicle;

import strategy.go.GoByFlyingAlgorithm;

public class Helicopter extends Vehicle {
    public Helicopter() {
        setGoAlgorithm(new GoByFlyingAlgorithm());
    }
}

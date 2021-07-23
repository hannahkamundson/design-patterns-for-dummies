package patterns.strategy.vehicle;

import patterns.strategy.go.GoByDrivingAlgorithm;

public class StreetRacer extends Vehicle {
    public StreetRacer() {
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}

package strategy.vehicle;

import strategy.go.GoByDrivingAlgorithm;

public class StreetRacer extends Vehicle {
    public StreetRacer() {
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}

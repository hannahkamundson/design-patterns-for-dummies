package strategy.vehicle;

import strategy.go.GoByDrivingFastAlgorithm;

public class FormulaOne extends Vehicle {
    public FormulaOne() {
        setGoAlgorithm(new GoByDrivingFastAlgorithm());
    }
}

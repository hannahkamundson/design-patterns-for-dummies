package patterns.strategy.vehicle;

import patterns.strategy.go.GoByDrivingFastAlgorithm;

public class FormulaOne extends Vehicle {
    public FormulaOne() {
        setGoAlgorithm(new GoByDrivingFastAlgorithm());
    }
}

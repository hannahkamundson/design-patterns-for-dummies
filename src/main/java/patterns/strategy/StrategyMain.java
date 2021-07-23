package patterns.strategy;

import patterns.strategy.go.GoByDrivingFastAlgorithm;
import patterns.strategy.vehicle.FormulaOne;
import patterns.strategy.vehicle.Helicopter;
import patterns.strategy.vehicle.StreetRacer;

public class StrategyMain {
    public static void run() {
        FormulaOne formulaOne = new FormulaOne();
        Helicopter helicopter = new Helicopter();
        StreetRacer streetRacer = new StreetRacer();

        formulaOne.go();
        helicopter.go();
        streetRacer.go();

        streetRacer.setGoAlgorithm(new GoByDrivingFastAlgorithm());
        streetRacer.go();
    }
}

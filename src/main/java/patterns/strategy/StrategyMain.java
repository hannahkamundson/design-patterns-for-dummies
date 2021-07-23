package patterns.strategy;

import patterns.strategy.go.GoByDrivingFastAlgorithm;
import patterns.strategy.vehicle.FormulaOne;
import patterns.strategy.vehicle.Helicopter;
import patterns.strategy.vehicle.StreetRacer;

/**
 * The strategy pattern takes in a an external class and runs it. This allows us to modify code all in one area instead
 * of across multiple generations of classes. You know to use this one whenever you are having to make changes to code
 * in a parent and child class.
 */
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

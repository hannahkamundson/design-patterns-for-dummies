package strategy;

import strategy.go.GoByDrivingFastAlgorithm;
import strategy.vehicle.FormulaOne;
import strategy.vehicle.Helicopter;
import strategy.vehicle.StreetRacer;

public class Main {
    public static void main(String[] args) {
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

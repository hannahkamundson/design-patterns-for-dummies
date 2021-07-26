package patterns;

import patterns.decorator.DecoratorMain;
import patterns.factory.FactoryMain;
import patterns.observer.ObserverMain;
import patterns.strategy.StrategyMain;

public class Main {
    public static void main(String[] args) {
        // Run the strategy pattern
        newPattern("Strategy");
        StrategyMain.run();

        // Run the decorator pattern
        newPattern("Decorator");
        DecoratorMain.run();

        // Run the factory pattern
        newPattern("Factory");
        FactoryMain.run();

        // Run the observer pattern
        newPattern("Observer");
        ObserverMain.run();
    }

    private static void newPattern(String pattern) {
        System.out.println("--------- " + pattern + " ---------");
    }
}

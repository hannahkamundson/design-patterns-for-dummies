package patterns;

import patterns.decorator.DecoratorMain;
import patterns.strategy.StrategyMain;

public class Main {
    public static void main(String[] args) {
        // Run the strategy pattern
        newPattern("Strategy");
        StrategyMain.run();

        // Run the decorator pattern
        newPattern("Decorator");
        DecoratorMain.run();
    }

    private static void newPattern(String pattern) {
        System.out.println("--------- " + pattern + " ---------");
    }
}

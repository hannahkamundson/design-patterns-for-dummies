package patterns;

import patterns.chainofresponsibility.ChainOfResponsibilityMain;
import patterns.decorator.DecoratorMain;
import patterns.factory.FactoryMain;
import patterns.observer.ObserverMain;
import patterns.singleton.SingletonMain;
import patterns.singleton.SingletonSynchronizedMain;
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

        // Run the chain of responsibility pattern
        newPattern("Chain of Responsibility");
        ChainOfResponsibilityMain.run();

        // Run singleton
        newPattern("Singleton");
        SingletonMain.run();
        newPattern("Singleton Synchronized");
        SingletonSynchronizedMain.runMain();
    }

    private static void newPattern(String pattern) {
        System.out.println("--------- " + pattern + " ---------");
    }
}

package patterns.decorator;

import patterns.decorator.computer.CD;
import patterns.decorator.computer.Computer;
import patterns.decorator.computer.Disk;
import patterns.decorator.computer.Monitor;

/**
 * The decorator pattern decorates around a class. It creates an abstract class that extends the base class and the
 * methods we are wanting to extend. The implementations of these abstract classes then take in the base class and do
 * call the base method within the implemented method and then add on whatever else is desired. This is especially
 * helpful when you want to be able to add different functionality to a function depending on what calls for. In this
 * case, instead of taking in parameters to decide whether to print out disk/monitor/cds + how many of each, you can
 * wrap it as needed throughout the code.
 */
public class DecoratorMain {
    public static void run() {
        Computer computer = new Computer();

        computer = new Disk(computer);
        computer = new Monitor(computer);
        computer = new CD(computer);
        computer = new CD(computer);

        System.out.println("You're getting a " + computer.description() + ".");
    }
}

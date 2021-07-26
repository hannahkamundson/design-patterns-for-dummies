package patterns.factory;

import patterns.factory.connection.Connection;
import patterns.factory.connection.FirstFactory;

/**
 * The factory method lets you specify which type of class you will be selection. You know to use this when you are
 * using multiple new operators to create different types so you put it into a method and were then having to change the
 * method. The factory pattern allows you to separate changeable code from the core code so you aren't having to
 * constantly modify the changing code.
 */
public class FactoryMain {
    public static void run() {
        FirstFactory factory = new FirstFactory("Oracle");
        Connection connection = factory.getConnection();

        System.out.println("You're connecting with " + connection.description() + ".");
    }
}

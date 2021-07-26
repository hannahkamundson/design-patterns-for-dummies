package patterns.factory;

import patterns.factory.connection.Connection;
import patterns.factory.connection.FirstFactory;

public class FactoryMain {
    public static void run() {
        FirstFactory factory = new FirstFactory("Oracle");
        Connection connection = factory.getConnection();

        System.out.println("You're connecting with " + connection.description() + ".");
    }
}

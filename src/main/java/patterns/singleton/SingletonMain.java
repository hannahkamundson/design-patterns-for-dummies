package patterns.singleton;

import patterns.singleton.db.Database;

/**
 * Use this when you don't want the user to be able to create multiple instances of a class.
 */
public class SingletonMain {
    public static void run() {
        Database database = Database.getInstance("products");

        printDatabaseName(database);

        database = Database.getInstance("employees");

        printDatabaseName(database);
    }

    private static void printDatabaseName(Database database) {
        System.out.println("This is the " + database.getName() + " database.");
    }
}

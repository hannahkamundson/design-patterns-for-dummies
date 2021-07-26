package patterns.observer;

import patterns.observer.database.Database;
import patterns.observer.database.observer.Archiver;
import patterns.observer.database.observer.Boss;
import patterns.observer.database.observer.Client;

/**
 * Observer pattern allows loose coupling between objects so that you don't have to put everything in one class.
 */
public class ObserverMain {
    public static void run() {
        Database database = new Database();
        Archiver archiver = new Archiver();
        Client client = new Client();
        Boss boss = new Boss();

        database.registerObserver(archiver);
        database.registerObserver(client);
        database.registerObserver(boss);
        database.editRecord("delete", "1");
    }
}

package patterns.singleton;

import patterns.singleton.db.DatabaseSynchronized;

public class SingletonSynchronizedMain implements Runnable {
    Thread thread;

    public static void runMain() {
        SingletonSynchronizedMain t = new SingletonSynchronizedMain();
    }

    public void run() {
        DatabaseSynchronized database = DatabaseSynchronized.getInstance("employees");
        System.out.println("This is the " + database.getName() + " database.");
    }

    public SingletonSynchronizedMain() {
        DatabaseSynchronized database = DatabaseSynchronized.getInstance("products");

        thread = new Thread(this, "second");
        thread.start();

        System.out.println("This is the " + database.getName() + " database.");
    }
}

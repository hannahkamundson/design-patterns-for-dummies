package patterns.singleton.db;

/**
 * Adding synchronized to the getInstance() ensures multiple threads can't create their own databaes at the same time.
 */
public class DatabaseSynchronized {
    private static DatabaseSynchronized singleObject;
    private int record;
    private String name;

    private DatabaseSynchronized(String n) {
        this.name = n;
        this.record = 0;
    }

    public static synchronized DatabaseSynchronized getInstance(String n) {
        if (singleObject == null) {
            singleObject = new DatabaseSynchronized(n);
        }

        return singleObject;
    }

    public void editRecord(String operation) {
        System.out.println("Performing a " + operation + " operation on record " + record + " in database " + name + ".");
    }

    public String getName() {
        return this.name;
    }
}
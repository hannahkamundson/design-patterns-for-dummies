package patterns.singleton.db;

public class Database {
    private static Database singleObject;
    private int record;
    private String name;

    private Database(String n) {
        this.name = n;
        this.record = 0;
    }

    public static Database getInstance(String n) {
        if (singleObject == null) {
            singleObject = new Database(n);
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

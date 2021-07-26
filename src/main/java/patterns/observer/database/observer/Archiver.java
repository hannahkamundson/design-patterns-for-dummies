package patterns.observer.database.observer;

public class Archiver implements Observer {
    @Override
    public void update(String operation, String record) {
        System.out.println("The archiver says a " + operation + " + operation was performed on record " + record + ".");
    }
}

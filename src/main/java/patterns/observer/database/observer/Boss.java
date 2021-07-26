package patterns.observer.database.observer;

public class Boss implements Observer {
    @Override
    public void update(String operation, String record) {
        System.out.println("The boss says a " + operation + " + operation was performed on record " + record + ".");
    }
}

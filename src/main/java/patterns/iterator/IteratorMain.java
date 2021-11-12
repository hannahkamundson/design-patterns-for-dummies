package patterns.iterator;

import patterns.iterator.vp.Division;
import patterns.iterator.vp.DivisionIterator;
import patterns.iterator.vp.VP;

public class IteratorMain {
    public static void run() {
        Division division = new Division("Sales");
        division.add("Ted");
        division.add("Bob");
        division.add("Carol");
        division.add("Alice");

        DivisionIterator iterator = division.iterator();

        while (iterator.hasNext()) {
            VP vp = iterator.next();
            vp.print();
        }

    }
}

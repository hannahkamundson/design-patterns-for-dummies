package patterns.flyweight;

import patterns.flyweight.student.StudentThreaded;

public class FlyweightThreadedMain implements Runnable {
    Thread thread;

    public FlyweightThreadedMain() {
        String names[] = {"Ralph", "Alice", "Sam"};
        int ids[] = {1001, 1002, 1003};
        int scores[] = {45, 55, 65};

        double total = 0;

        for (int loopIndex = 0; loopIndex < scores.length; loopIndex++) {
            total += scores[loopIndex];
        }

        double averageScore = total / scores.length;

        StudentThreaded student = StudentThreaded.getInstance();

        student.setAverageScore(averageScore);
        student.setName("Ralph");
        student.setId(1002);
        student.setScore(45);

        thread = new Thread(this, "second");
        thread.start();

        System.out.println("Name: " + student.getName());
        System.out.println("Standing: " + Math.round(student.getStanding()));
        System.out.println("");
    }

    public static void runMain() {
        FlyweightThreadedMain t = new FlyweightThreadedMain();
    }

    public void run() {
        StudentThreaded student = StudentThreaded.getInstance();
        System.out.println("Name: " + student.getName());
        System.out.println("Standing: " + Math.round(student.getStanding()));
    }
}

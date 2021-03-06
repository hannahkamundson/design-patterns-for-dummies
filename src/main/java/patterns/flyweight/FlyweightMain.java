package patterns.flyweight;

import patterns.flyweight.student.Student;

public class FlyweightMain {
    public static void run() {
        String names[] = {"Ralph", "Alice", "Sam"};
        int ids[] = {1001, 1002, 1003};
        int scores[] = {45, 55, 65};

        double total = 0;

        for (int loopIndex = 0; loopIndex < scores.length; loopIndex++) {
            total += scores[loopIndex];
        }

        double averageScore = total / scores.length;

        Student student = new Student(averageScore);

        for (int loopIndex = 0; loopIndex < scores.length; loopIndex++) {
            student.setName(names[loopIndex]);
            student.setId(ids[loopIndex]);
            student.setScore(scores[loopIndex]);

            System.out.println("Name: " + student.getName());
            System.out.println("Standing: " + Math.round(student.getStanding()));
            System.out.println("");
        }
    }
}

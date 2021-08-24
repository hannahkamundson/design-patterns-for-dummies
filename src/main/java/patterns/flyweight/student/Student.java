package patterns.flyweight.student;

public class Student {
    private String name;
    private int id;
    private int score;
    private double averageScore;

    public Student(double a) {
        this.averageScore = a;
    }

    public void setName(String n) {
        this.name = name;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setScore(int s) {
        this.score = s;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getScore() {
        return this.score;
    }

    public double getStanding() {
        return (((double) score) / averageScore - 1.0) * 100.0;
    }
}

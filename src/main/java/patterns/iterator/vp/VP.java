package patterns.iterator.vp;

public class VP {
    private String name;
    private String division;

    public VP(String n, String d) {
        this.name = n;
        this.division = d;
    }

    public String getName() {
        return this.name;
    }

    public void print() {
        System.out.println("Name: " + name + " Division: " + division);
    }
}

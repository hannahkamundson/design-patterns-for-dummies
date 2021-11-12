package patterns.iterator.vp;

public class Division {
    private VP[] VPs = new VP[100];
    private int number = 0;
    private String name;

    public Division(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void add(String n) {
        VP vp = new VP(n, this.name);
        VPs[number++] = vp;
    }

    public DivisionIterator iterator() {
        return new DivisionIterator(VPs);
    }
}

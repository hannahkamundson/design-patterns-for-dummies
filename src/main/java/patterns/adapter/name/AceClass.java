package patterns.adapter.name;

public class AceClass implements AceInterface {
    String name;

    @Override
    public void setName(String n) {
        this.name = n;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

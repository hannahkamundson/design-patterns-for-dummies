package patterns.adapter.name;

public class AcmeClass implements AcmeInterface {
    String firstName;
    String lastName;

    @Override
    public void setFirstName(String f) {
        this.firstName = f;
    }

    @Override
    public void setLastName(String l) {
        this.lastName = l;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

}

package patterns.adapter.name;

public class AceToAcmeAdapter implements AcmeInterface {
    AceClass aceObject;
    String firstName;
    String lastName;

    public AceToAcmeAdapter(AceClass a) {
        this.aceObject = a;
        this.firstName = aceObject.getName().split(" ")[0];
        this.lastName = aceObject.getName().split(" ")[1];
    }

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

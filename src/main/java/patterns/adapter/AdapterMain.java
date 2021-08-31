package patterns.adapter;

import patterns.adapter.name.AceClass;
import patterns.adapter.name.AceToAcmeAdapter;

public class AdapterMain {
    public static void run() {
        AceClass aceObject = new AceClass();
        aceObject.setName("Cary Grant");

        AceToAcmeAdapter adapter = new AceToAcmeAdapter(aceObject);

        System.out.println("Customer's first name: " + adapter.getFirstName());
        System.out.println("Customer's last name: " + adapter.getLastName());

    }
}

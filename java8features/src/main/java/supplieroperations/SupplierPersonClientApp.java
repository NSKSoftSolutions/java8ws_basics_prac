package supplieroperations;

import org.example.bo.PersonService;
import predicateoperations.com.example.domain.Person;

import java.util.function.Supplier;

public class SupplierPersonClientApp {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Supplier<Person> personSupplier = () -> new Person("Sajjad Alikhan Navab", 32);
        personService.addPerson(personSupplier);
    }
}
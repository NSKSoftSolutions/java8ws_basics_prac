package supplieroperations;

import predicateoperations.com.example.domain.Person;

import java.util.function.Supplier;

public class SupplierPersonClientApp {
    public static void main(String[] args) {
        Supplier<Person> personSupplier = () -> new Person("Sajjad Alikhan Navab", 32);
        System.out.println(personSupplier.get());
    }
}
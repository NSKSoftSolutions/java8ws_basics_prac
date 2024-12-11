package supplieroperations;

import java.util.function.Supplier;

public class DefaultMessageUsingSupplier {
    public static void main(String[] args) {

        Supplier<String> s = () -> "Welcome to Java 8 Functional Programming!";
        System.out.println(s.get());


    }
}

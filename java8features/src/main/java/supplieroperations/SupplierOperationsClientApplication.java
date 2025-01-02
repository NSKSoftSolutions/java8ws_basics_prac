package supplieroperations;


import java.util.function.Supplier;

public class SupplierOperationsClientApplication {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello Java Developers";
        System.out.println(supplier.get());
    }


}

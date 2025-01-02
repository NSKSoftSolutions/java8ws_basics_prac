package supplieroperations;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class FrootListSupplierClientApp {
    public static void main(String[] args) {


        Supplier<List<String>> frootSupplier = () -> {
            List<String> froots = new LinkedList<>();
            froots.add("Banana");
            froots.add("Apple");
            froots.add("Apricot");
            froots.add("Ginger");
            froots.add("Thick Tak ");
            return froots;
        };
        System.out.println("Froots Imported from Dubai");
        frootSupplier.get().forEach(System.out::println);


    }
}

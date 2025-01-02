package supplieroperations;

import java.util.Random;
import java.util.function.IntSupplier;

public class GenerateRandomNumberSupplierBasicClientApp {

    public static void main(String[] args) {

        IntSupplier intSupplier = () -> new Random().nextInt();
        System.out.println(intSupplier.getAsInt());

    }

}

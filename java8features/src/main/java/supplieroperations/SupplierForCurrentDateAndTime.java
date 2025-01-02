package supplieroperations;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierForCurrentDateAndTime {
    public static void main(String[] args) {
        Supplier dateAndTime = () -> LocalDateTime.now();
        System.out.println("LocalDate and Time is -- " + dateAndTime.get());
    }
}

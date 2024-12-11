package org.example.bo;

import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class CalculatorService {

    private int value1;
    private int value2;

    public int addition(IntSupplier value1, IntSupplier value2) {
        return value1.getAsInt() + value2.getAsInt();
    }


    public int sub(IntSupplier value1, IntSupplier value2) {
        return value1.getAsInt() - value2.getAsInt();
    }

    public int multiplication(IntSupplier value1, IntSupplier value2) {
        return value1.getAsInt() * value2.getAsInt();
    }

    public int divsion(IntSupplier value1, IntSupplier value2) {
        return value1.getAsInt() / value2.getAsInt();
    }
}

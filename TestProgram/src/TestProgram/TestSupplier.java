package TestProgram;

import java.util.Date;
import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {
        Supplier<Date> supplier = () -> new Date();
        System.out.println(supplier.get());

        // NOTE - No chaining is there in supplier as there is no return value.
    }
}

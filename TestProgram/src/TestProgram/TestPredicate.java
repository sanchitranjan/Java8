package TestProgram;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        Predicate<String> checkLength = str ->  str.length() >= 5;
        Predicate<String> checkEven = str -> str.length() % 2 == 0;

        System.out.println("String is SANCHIT RANJAN and checkLength predicate is working ? " + checkLength.test("SANCHIT RANJAN"));
        System.out.println("String is SANCHIT RANJAN and checkEven predicate is working ? " + checkEven.test("odd"));

        System.out.println("String is SANCHIT RANJAN and AND both predicate is working ? " + checkLength.and(checkEven).test("ODD"));
        System.out.println("String is SANCHIT RANJAN and OR both predicate is working ? " + checkLength.or(checkEven).test("Even"));
        System.out.println("String is SANCHIT RANJAN and NOT both predicate is working ? " + checkLength.negate().test("ODD"));
    }
}

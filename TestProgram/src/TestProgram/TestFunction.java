package TestProgram;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {

        Function<Integer, Integer> squareMe = i -> 2 * i;
        Function<Integer, Integer> cubeMe = i -> i * i * i;

        System.out.println("Function is working ? " + squareMe.apply(5));

        // f1.andThen(f2).apply() -> first f1 then f2
        // f2.compose(f1).apply() -> first f2 then f1

        //f1.andThen(f2)..andThen(f3).andThen(f4).apply() -> Multiple function chaining

        System.out.println("Function is working ? " + squareMe.andThen(cubeMe).apply(2));
    }
}

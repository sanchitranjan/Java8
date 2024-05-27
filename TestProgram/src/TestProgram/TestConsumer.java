package TestProgram;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        Consumer<Integer> testConsumer = (i) -> System.out.println("Consumer demo = " + i);

        testConsumer.accept(10);
    }
}

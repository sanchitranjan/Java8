package TestProgram;

@FunctionalInterface
interface  demo {
    public void print();
}

public class TestLambda {
    public static void main(String[] args) {
        demo obj = () -> System.out.println(" This is a demo to show how lambda works");
        obj.print();
    }
}

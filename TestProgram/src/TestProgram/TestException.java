package TestProgram;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestException {
    public static void test() {
        throw new NullPointerException("This is NullPointerException");
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 2 nos");
        int x = sc.nextInt();
        int y = sc.nextInt();
        try {
            test();
        }
        catch (Exception e) {
            System.out.println(x + y);
            e.printStackTrace();
        }
    }
}

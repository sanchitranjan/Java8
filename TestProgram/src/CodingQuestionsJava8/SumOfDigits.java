package CodingQuestionsJava8;

import java.util.stream.IntStream;

public class SumOfDigits {
    public static void main(String[] args) {

        int number = 12345;

        IntStream s = String.valueOf(number).chars();

        int sum = s.map(Character::getNumericValue).sum();

        System.out.println(sum);
    }
}



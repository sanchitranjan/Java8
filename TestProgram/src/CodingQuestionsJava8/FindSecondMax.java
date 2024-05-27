package CodingQuestionsJava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,56,34,10,15,78,56,90,65);

        int secondMax = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(" Second Max = " + secondMax);
    }
}

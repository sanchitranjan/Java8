// Q Find Maximum no in a list and second largest

package CodingQuestionsJava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMax {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,56,34,10,15,78,56,90,65);

        int max = list.stream().max(Comparator.naturalOrder()).get();
        int min = list.stream().max(Comparator.reverseOrder()).get();

        int secondMax = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();

        System.out.println(" Largest = " + max + " Second Max = " + secondMax + " "+ min);
    }
}

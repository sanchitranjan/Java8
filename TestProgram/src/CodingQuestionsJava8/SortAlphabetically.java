// Q Sort a list of string alphabetically

package CodingQuestionsJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class       SortAlphabetically {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Banana", "Apple","Pear","Cherry","Strawberry");

        List<String> sorted = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sorted);
    }
}

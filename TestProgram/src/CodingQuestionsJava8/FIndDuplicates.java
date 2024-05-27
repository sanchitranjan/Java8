// Q Find the duplicates elements in a given array using stream function
// Input : [10,28,87,10,20,76,28,80]
// Output : 10 28

package CodingQuestionsJava8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FIndDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(28);
        list.add(87);
        list.add(10);
        list.add(20);
        list.add(76);
        list.add(28);
        list.add(80);
        list.add(80);
        list.add(80);
        list.add(80);
        list.add(80);

        Set<Integer> set = new HashSet<>();
        list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(i -> System.out.println(i));

        System.out.println(set);
    }
}

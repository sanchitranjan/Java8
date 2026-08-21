// Q Sort a list of string alphabetically

package CodingQuestionsJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class       SortAlphabetically {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Banana", "Apple","Pear","Cherry","Strawberry");

        /*
            collect() is a terminal operation on the Stream, but it returns a List. After that, you're calling forEach() on the List, 
            not on the Stream. First create the sorted List, then iterate over that List.

            Important distinction ⭐

            If you did:
            list.stream()
                .sorted()
                .forEach(System.out::println);
        
            then forEach() is a Stream terminal operation.    
            For a sequential ordered stream, forEach() will generally process the elements in encounter order.
            But with a parallel stream:
            list.parallelStream()
                .sorted()
                .forEach(System.out::println);
            
            you cannot rely on forEach() preserving the encounter order.
            If you specifically want ordered output from a parallel stream:
          */  
        list.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList())
                .forEach(i -> System.out.println(i));

        
        List<String> sorted = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sorted);
    }
}

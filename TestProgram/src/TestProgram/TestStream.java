package TestProgram;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(20);
        list.add(55);
        list.add(10);
        list.add(54);

        List l = list.stream().filter(i -> i % 2 == 0).filter(i -> i > 10).collect(Collectors.toList());
        List sorted = list.stream().sorted().collect(Collectors.toList());

        // Descending order
        List reverseSort = list.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        List revSort = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        // Count
        int count = (int) list.stream().filter(i -> i % 2 == 0).count();

        // Min Max
        int min = list.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        int max = list.stream().max((i1,i2) -> i1.compareTo(i2)).get();

        // To array
        Object[] arr = list.stream().filter(i -> i % 2 == 0).filter(i -> i > 10).toArray();

        // Of method
        String name[] = {"Ravi","Ram","Sohan", "Mohan"};
        Stream.of(12,78,34,89,10,23).filter(i -> i % 2 == 0).filter(i -> i > 20).forEach(x -> System.out.print(x + " "));
        String str = Stream.of(name).filter(i -> i.length() < 4).collect(Collectors.joining(" "));

        System.out.println();
        System.out.println(str);
        System.out.println(l);
        System.out.println(sorted);
        System.out.println(count);
        System.out.println(reverseSort);
        System.out.println(min);
        System.out.println(max);
        System.out.println();

//        for(Object i : arr)
//            System.out.println(i);


    }
}

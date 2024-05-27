package CodingQuestionsJava8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,4,5);

        List<Integer> uniques = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniques);
    }
}

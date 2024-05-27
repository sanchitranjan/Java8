package CodingQuestionsJava8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Dups {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,1,2,5);
        Set<Integer> unique = new HashSet<>();
        List<Integer> dups = list.stream().filter(i -> !unique.add(i)).collect(Collectors.toList());

        List<Integer> unq = list.stream().distinct().collect(Collectors.toList());

        System.out.println(unq);

        for(int i: dups){
            System.out.println(i);
        }
    }
}

// Q Count the no of occurences of each word

package CodingQuestionsJava8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurancesOfWord {
    public static void main(String[] args) {

        String str = "welcome to code decode and code decode welcome you";
        List<String> list = Arrays.asList(str.split(" "));
        //System.out.println(list);
        Map<String, Long> map = new HashMap<>();

        map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}



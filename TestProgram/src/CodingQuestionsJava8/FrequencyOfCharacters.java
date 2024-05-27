// Q Count frequency of each character in a word.

package CodingQuestionsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "sanchit_ranjan";

        IntStream stream = str.chars();
        Stream<Character> charStream = stream.mapToObj(c -> (char) c);

        Map<Character, Long> map = charStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}


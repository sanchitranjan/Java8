package TestProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestIntStream {
    public static void main(String[] args) {

        List<Integer> list  = Arrays.asList(1,2,3,4,5,2);
        List<Integer> intStream = Arrays.asList(9,8,7,6,5,8);
        String str = "hello_world";

//      list.stream().
//        intStream.
//        IntStream asci = str.chars();
//        Stream<Character> stream    = asci.mapToObj(c -> (char) c).collect(Collectors.toCollection());
    }
}

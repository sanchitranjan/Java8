package CodingQuestionsJava8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reuse_Streams {
    public static void main(String[] args) {

        String inputArray[] = {"Amit", "Dog", "Cat","Ball", "Amit"};
        Stream<String> inputStream = Arrays.asList(inputArray).stream();
        inputStream.forEach(ele -> System.out.println(ele));

        Long count = inputStream.filter(i -> "Amit".equals(i)).count();
        //Map<String, Long> map = inputStream.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        System.out.println(count);
    }
}

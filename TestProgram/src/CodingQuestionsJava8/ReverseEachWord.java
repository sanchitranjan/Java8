// Reverse each word in a sentence

package CodingQuestionsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {

        String sentence = "Hello world this is java";

        String[] words = sentence.split(" ");

        String str = Arrays.stream(words).map(wrd -> new StringBuilder(wrd).reverse()).collect(Collectors.joining(" "));

        System.out.println(str);
    }
}

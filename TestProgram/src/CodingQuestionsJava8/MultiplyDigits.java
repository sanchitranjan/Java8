// Q multiply its digits and give the output eg no = 12345 out = 120

package CodingQuestionsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultiplyDigits {
    public static void main(String[] args) {

        Integer ar[] = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(ar);
        Optional no = list.stream().reduce((a, b)-> a * b);
        System.out.println(no.get());
    }
}

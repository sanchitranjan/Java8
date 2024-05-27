// Find the last element of List<String>

package CodingQuestionsJava8;

import java.util.Arrays;
import java.util.List;

public class LastElement {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two","Three","Four","Five","Six");

        String str = list.stream().skip(list.size() - 1).findFirst().get();
        System.out.println(str);
    }
}


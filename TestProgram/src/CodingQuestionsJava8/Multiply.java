// Q Multiply using functional interface

package CodingQuestionsJava8;

public class Multiply {
    public static void main(String[] args) {
        MultiplyInterface multiply = (i, j) ->  i * j;

        System.out.println(multiply.multiply(4,5));
    }
}

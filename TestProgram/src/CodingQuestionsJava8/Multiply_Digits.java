package Java8_Coding_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Multiply_Digits {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Optional no = list.stream().reduce((a,b) -> a * b);
		// int result = list.stream().reduce(1, (a,b) -> a * b);
		
		System.out.println(no.isPresent() ? no.get() : "List is empty");
	}
}

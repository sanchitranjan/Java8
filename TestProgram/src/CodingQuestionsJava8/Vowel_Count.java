/*	Q find vowel count and fin dups

*/
package Java8_Coding_Questions;

import java.util.Map;
import java.util.stream.Collectors;

public class Vowel_Count {
	public static void main(String[] args) {
		
		String input = "hello hello";
		
		Long count = input.chars()
				.filter(ch -> ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				.count();

		Map<String, Long> map = input.chars()
				.mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
		
		System.out.println(count);
		System.out.println(map);
	}
}

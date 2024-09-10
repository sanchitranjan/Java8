package Java8_Coding_Questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class First_Non_Repeating_Character {
	public static void main(String[] args) {
		
		String input = "Hello World";

		Map<Character, Long> countChar = input.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		Optional<Character> FirstNonRepeat = countChar.entrySet().stream()
											.filter(i-> i.getValue() == 1)
											.map(i-> i.getKey()).findFirst();
		
		Optional<Character> FirstRepeat = countChar.entrySet().stream()
											.filter(i-> i.getValue() > 1)
											.map(i-> i.getKey()).findFirst();
		
		System.out.println("First non repeating char = " + FirstNonRepeat.orElse(null));
		System.out.println("First repeating char = " + FirstRepeat.orElse(null));
		
//		if(FirstNonRepeat.isPresent()) {
//			System.out.println("First non repeating char = " + FirstNonRepeat.get());
//		}
//		if(FirstRepeat.isPresent()) {
//			System.out.println("First repeating char = " + FirstRepeat.get());
//		}
	}
}

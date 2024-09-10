/* Q -> Can we Reuse Stream ?
	
	 -> No we cannot reuse stream. We have to declare it every time OR use Supplier
*/

package Java8_Coding_Questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reuse_Stream {
	public static void main(String[] args) {
		
		String inputArray[] = {"Amit","Dog","Cat","Amit","Ball"};
		
		Supplier<Stream<String>> inputStream = () -> Stream.of(inputArray);
		
		inputStream.get().forEach(ele -> System.out.println(ele));
		
		// inputStream = Arrays.asList(inputArray).stream();
		Long count = inputStream.get().filter(i -> "Dog".equals(i)).count();
		
		// inputStream = Arrays.asList(inputArray).stream();
		Map<String, Long> count2 = inputStream.get().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));   
		
		System.out.println(count + " " + count2);
	}
}

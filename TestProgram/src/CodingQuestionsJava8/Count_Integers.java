/*
IN   [1,2,3,4,5,6,7,1,1,3,7]   
OUT  1 -> 3
     2 -> 1
     3 -> 2
     ...
 */

package Java8_Coding_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_Integers {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,1,1,3,7);
		
		Map<Integer, Long> map = list.stream().collect(
				Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		map.forEach((Key, Val) -> System.out.println(Key + " " + Val));
	}
}

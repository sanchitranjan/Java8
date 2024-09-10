package Java8_Coding_Questions;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Find_Duplicate {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,34,56,99,33,99,12,2);
		Set<Integer> unique = new HashSet<>();
		
		List<Integer> dups = list.stream().filter(x -> !unique.add(x)).collect(Collectors.toList());
		
		// NOTE we cannot open stream on map but we can open in set. 
		
		/*  List<Integer> duplicates = list.stream()
                .collect(Collectors.groupingBy(i -> i))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 1)
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.toList());
		*/
		
		
		System.out.println(dups);
		System.out.println(unique);
		
	}

}

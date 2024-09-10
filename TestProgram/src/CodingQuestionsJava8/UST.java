package Java8_Coding_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UST {
	public static void main(String[] args) {
		
		// Find words starting with A and collect them
		String str = "Hello world this is a Alpha Java 8 Alpine";
		String arr[] = str.split(" "); 
		
		List<String> list = Arrays.stream(arr).filter(i -> i.startsWith("A")).collect(Collectors.toList());
		list.forEach(i-> System.out.println(i));
		
//		// Find duplicate words in a string and count them
//		String str1 = "Hello there this is Java8 Hello Java8";
//		String s[] = str1.split(" ");
//		
//		Set<String> set = new HashSet<>();
//		List<String> list1 = Arrays.stream(s).filter(i-> !set.add(i)).collect(Collectors.toList());
//		list1.forEach(i-> System.out.println(i));
	}
}

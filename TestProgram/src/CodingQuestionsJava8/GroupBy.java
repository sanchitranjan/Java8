package Java8_Coding_Questions;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GroupBy {
	public static void main(String args[]) {
		
		List<Employee> list = List.of(  new Employee("Sanchit", 25, 50000), 
										new Employee("Rohan", 26, 45000),
										new Employee("Rohan", 26, 48000));
	
//		Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getName));	
		
		Map<String, Long> map2 = list.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
		
//		for(Entry entry: map2.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
		map2.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		
		map2.forEach((Key, Val) -> System.out.println(Key + " " + Val));
	}
}

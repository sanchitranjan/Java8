package Java8_Coding_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
	public static void main(String[] args) {
	
	List<Employee> listEmployees = new ArrayList<>();	
	listEmployees.add(new Employee("rohan", 30));	
	listEmployees.add(new Employee("sohan", 40));
	listEmployees.add(new Employee("ram", 10));
	listEmployees.add(new Employee("shyam", 50));
	listEmployees.add(new Employee("rohan", 30));
	listEmployees.add(new Employee("ram", 10));
		
//	// 1st Approach
	Map<String, Long> freqOfEmployees = listEmployees.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
	List<String> duplicateEmployees = freqOfEmployees.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toList());                                           
	
	// 2nd Approach
//	List<String> names = listEmployees.stream().map(Employee::getName).collect(Collectors.toList());
//	Set<String> listDuplicate = listEmployees.stream().map(Employee::getName).filter(name -> Collections.frequency(names, name) > 1).collect(Collectors.toSet());              
	
	System.out.println(duplicateEmployees);
//	System.out.println(listDuplicate);
	
	}
}

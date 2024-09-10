package Java8_Coding_Questions;

import java.util.*;
import java.util.stream.Collectors;

public class Find_Max_MaxBy {
	public static void main(String[] args) {
		
		List<Employee> list = List.of(  new Employee("Sanchit", 25, 50000), 
				new Employee("Rohan", 26, 45000),
				new Employee("Sohan", 26, 48000));
		
		//Employee highest_Employee = list.stream().max(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge)).get();

		Employee highest_Employee = list.stream().max(Comparator.comparing(emp -> emp.getSalary())
										.thenComparing(emp -> emp.getAge())).get()
										.orElse(null);

		List<Integer> lst = Arrays.asList(4,5,6,2,3,8,9,6,1);
		int max = lst.stream().max(Comparator.reverseOrder()).get();

//		Optional<Employee> highest = list.stream().collect(
//				Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		
		System.out.println(highest_Employee + " " + max);
	}
}

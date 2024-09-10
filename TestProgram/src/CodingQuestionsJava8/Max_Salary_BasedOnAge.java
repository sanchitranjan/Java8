package Java8_Coding_Questions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Max_Salary_BasedOnAge {
	public static void main(String[] args) {
	
		List<Employee> list = List.of(  new Employee("Sanchit", 25, 50000), 
										new Employee("Rohan", 26, 45000),
										new Employee("Sohan", 24, 48000),
										new Employee("Ram", 25, 38000),
										new Employee("Amit", 26,  58000));
		
		Map<Integer, Optional<Employee>> map = list.stream().collect(
					Collectors.groupingBy(Employee::getAge, 
					Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		
		map.forEach((key, val) -> System.out.println(key + " " + val));
					
	}
}

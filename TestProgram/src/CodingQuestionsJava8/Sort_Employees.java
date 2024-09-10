// Q You have to sort employees by their age, name and salary

package Java8_Coding_Questions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_Employees {

	public static void main(String[] args) {
		
		List<Employee> list = List.of(  new Employee("Sanchit", 25, 50000), 
										new Employee("Rohan", 26, 45000),
										new Employee("Sohan", 26, 48000));
		
		List<Employee> ageGreaterThan25 = list.stream().filter(x-> x.getAge() > 24).collect(Collectors.toList());
		
		List<Employee> sortedEmployees = list.stream().sorted(Comparator.comparingInt(Employee::getAge)
											.thenComparing(Employee::getName)
											.thenComparingDouble(Employee::getSalary))
											.collect(Collectors.toList());
		
		System.out.println(sortedEmployees);
	}

}

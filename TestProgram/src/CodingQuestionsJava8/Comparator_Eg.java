package CodingQuestionsJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparator_Eg {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee("Sanchit", 25, 50000),
                                            new Employee("Rohan", 25, 45000),
                                            new Employee("Sohan", 24, 48000));

        System.out.println(list);

        list.sort(Comparator.comparing(Employee::getAge)
                .thenComparing(Employee::getName)
                .thenComparing(Employee::getSalary));

        System.out.println(list);
    }
}

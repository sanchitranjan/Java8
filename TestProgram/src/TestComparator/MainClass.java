package TestComparator;

import java.util.Arrays;
import java.util.Comparator;

public class  MainClass {
    public static void main(String[] args) {

        Employee[] e = new Employee[4];
        e[0] = new Employee(2, "Sanchit", 55000);
        e[1] = new Employee(3, "Raj", 34000);
        e[2] = new Employee(1, "Shiv", 67000);
        e[3] = new Employee(4, "John", 45000);

        Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getSalary() - o1.getSalary();
            }
        };

        Arrays.sort(e, SalaryComparator);

        System.out.println(Arrays.toString(e));

    }
}

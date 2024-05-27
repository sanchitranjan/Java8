package TestComparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    int id;
    String name;
    int Salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        Salary = salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return this.getId() - o.getId();
    }

    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getSalary() - o2.getSalary();
        }
    };
}

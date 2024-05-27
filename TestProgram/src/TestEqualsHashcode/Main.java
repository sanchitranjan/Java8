package TestEqualsHashcode;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Sanchit");

        Employee e2 = new Employee();
        e2.setId(1);
        e2.setName("Sanchit");

        Employee e3 = e1;

        System.out.println("Equals assignment operator " + (e1 == e2));
        System.out.println("Equals method " + (e1.equals(e2)));
        System.out.println("Hashcode method " + (e1.hashCode() == e2.hashCode()));
    }
}

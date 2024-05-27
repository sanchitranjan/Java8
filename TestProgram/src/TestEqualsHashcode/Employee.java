package TestEqualsHashcode;

public class Employee {
    int id;
    String Name;

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }

        if(this == o) { return true; }

        Employee e = (Employee) o;
        return this.getId() == e.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}

package TestProgram;

class Animal {
    String name;
    int age;

    Animal() {}
    Animal(String _name, int _age){
        this.name = _name;
        this.age = _age;
        System.out.println("Animal constructor is running");
    }
    public void walk(){
        System.out.println("Animal is walking");
        System.out.println();
    }
}

class Dog extends Animal{
    String breed;

    Dog() {}
    Dog(String _name, int _age, String _breed){
        super(_name, _age);
        this.breed = _breed;
        System.out.println("Dog constructor is running");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    public void bark() {
        System.out.println("name = " + name + " age = " + age + " breed = " + breed);
        System.out.println();
    }
}

class Cat extends Animal{
    String breed;
    Cat() {}
    Cat(String _name, int _age, String _breed){
        super(_name, _age);
        this.breed = _breed;
        System.out.println("Cat constructor is running");
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }

    public void meow() {
        System.out.println("Cat is meowing");
        System.out.println();
    }
}

public class TestInheritence {
    public static void main(String[] args) {

//         TestProgram.Animal a[] = new TestProgram.Animal[2];
//         a[0] = new TestProgram.Dog();
//         a[1] = new TestProgram.Cat();
//
//         for(int i = 0; i < 2; i++) {
//             a[i].walk();
//         }

         // TestProgram.Dog Object
         Animal d = new Cat("brownie", 5, "labrador");
         d.walk();


        // Reference variable
        // TestProgram.Animal ref = new TestProgram.Dog();
        // ref.walk();







    }
}

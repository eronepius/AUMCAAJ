

class Animal {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animal
class Dog extends Animal {

    // overriding the eat() method
    @Override
    public void eat() {
        System.out.println("I eat dog food");
        super.eat();
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

public class Inheritance_M_Overriding{
    public static void main(String[] args) {
        Dog labrador = new Dog();

        labrador.eat();
        labrador.bark();
    }
}

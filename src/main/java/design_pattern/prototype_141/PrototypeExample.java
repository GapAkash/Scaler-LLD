package design_pattern.prototype_141;

// Prototype interface
interface Animal extends Cloneable {
    Animal clone();

    void sound();
}

// Concrete prototype
class Dog implements Animal {
    @Override
    public Animal clone() {
        return new Dog(); // Perform a shallow copy or create a new instance with default values
    }

    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

// Client code
public class PrototypeExample {
    public static void main(String[] args) {
        Animal dogPrototype = new Dog();

        Animal dog1 = dogPrototype.clone();
        dog1.sound(); // Output: Woof!

        Animal dog2 = dogPrototype.clone();
        dog2.sound(); // Output: Woof!
    }
}


package design_pattern.prototype_141;

import java.util.HashMap;
import java.util.Map;

// Prototype interface

class Cat implements Animal {
    @Override
    public Animal clone() {
        return new Cat(); // Perform a shallow copy or create a new instance with default values
    }

    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

// Prototype registry
class PrototypeRegistry {
    private Map<String, Animal> prototypes;

    public PrototypeRegistry() {
        prototypes = new HashMap<>();
        initializePrototypes();
    }

    private void initializePrototypes() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        prototypes.put("dog", dog);
        prototypes.put("cat", cat);
    }

    public Animal getPrototype(String key) {
        Animal prototype = prototypes.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("Prototype not found for key: " + key);
        }
        return prototype.clone();
    }
}

// Client code
public class PrototypeRegistryExample {
    public static void main(String[] args) {
        PrototypeRegistry registry = new PrototypeRegistry();

        Animal dog = registry.getPrototype("dog");
        dog.sound(); // Output: Woof!

        Animal cat = registry.getPrototype("cat");
        cat.sound(); // Output: Meow!
    }
}


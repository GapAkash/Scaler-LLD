package design_pattern.factory_151.factory_method;

public class DogCreator extends AnimalCreator{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

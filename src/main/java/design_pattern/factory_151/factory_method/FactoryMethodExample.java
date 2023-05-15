package design_pattern.factory_151.factory_method;

public class FactoryMethodExample {

    public static void main(String[] args) {
        AnimalCreator dogCreator = new DogCreator();
        Animal dog = dogCreator.createAnimal();
        dog.sound();

        AnimalCreator catCreator = new CatCreator();
        Animal cat = catCreator.createAnimal();
        cat.sound();
    }
}

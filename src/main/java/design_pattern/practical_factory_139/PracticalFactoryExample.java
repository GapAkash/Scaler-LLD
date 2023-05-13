package design_pattern.practical_factory_139;

// Vehicle interface
interface Vehicle {
    void drive();
}

// Concrete implementations of Vehicle
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a motorcycle");
    }
}

// Vehicle factory
class VehicleFactory {
    // Factory method for creating vehicles
    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("motorcycle")) {
            return new Motorcycle();
        }
        throw new IllegalArgumentException("Invalid vehicle type: " + type);
    }
}

// Client code
public class PracticalFactoryExample {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        // Create a car using the factory
        Vehicle car = factory.createVehicle("car");
        car.drive(); // Output: Driving a car

        // Create a motorcycle using the factory
        Vehicle motorcycle = factory.createVehicle("motorcycle");
        motorcycle.drive(); // Output: Driving a motorcycle
    }
}


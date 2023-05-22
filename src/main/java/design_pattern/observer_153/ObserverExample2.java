package design_pattern.observer_153;

import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject
class WeatherStation2 implements Subject {
    private List<Observer> observers;
    private int temperature;

    public WeatherStation2() {
        observers = new ArrayList<>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

// Concrete Observer
class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println("User " + name + " received an update: Temperature is " + temperature + " degrees.");
    }
}

// Usage
public class ObserverExample2 {
    public static void main(String[] args) {
        WeatherStation2 weatherStation = new WeatherStation2();

        User user1 = new User("John");
        User user2 = new User("Jane");

        weatherStation.registerObserver(user1);
        weatherStation.registerObserver(user2);

        weatherStation.setTemperature(25);

        weatherStation.removeObserver(user1);

        weatherStation.setTemperature(30);
    }
}


package design_pattern.observer_153;

import java.util.ArrayList;
import java.util.List;

// Subject (Publisher)
class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

// Concrete Observer
class CurrentConditionsDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Current temperature: " + temperature);
    }
}

// Concrete Observer
class ForecastDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Forecast: Expect warmer weather!");
    }
}

// Usage
public class ObserverExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Create observers
        Observer currentConditionsDisplay = new CurrentConditionsDisplay();
        Observer forecastDisplay = new ForecastDisplay();

        // Register observers with the subject
        weatherStation.addObserver(currentConditionsDisplay);
        weatherStation.addObserver(forecastDisplay);

        // Simulate weather changes
        weatherStation.setTemperature(25.5f);
        // Output:
        // Current temperature: 25.5
        // Forecast: Expect warmer weather!

        // Unregister an observer
        weatherStation.removeObserver(forecastDisplay);

        weatherStation.setTemperature(30.0f);
    }
}


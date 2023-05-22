package design_pattern.flyweight_154;

import java.util.HashMap;
import java.util.Map;

// Flyweight interface
interface Shape {
    void draw();
}

// Concrete flyweight class
class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a " + color + " circle at (" + x + ", " + y + ") with radius " + radius);
    }
}

// Flyweight factory
class ShapeFactory {
    private Map<String, Shape> circleMap;

    public ShapeFactory() {
        this.circleMap = new HashMap<>();
    }

    public Shape getCircle(String color) {
        Shape circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }

        return circle;
    }
}

// Usage
public class FlyweightExample {
    private static final String[] colors = { "Red", "Green", "Blue", "Yellow" };

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) shapeFactory.getCircle(getRandomColor());
            circle.setCoordinates(getRandomX(), getRandomY());
            circle.setRadius(10);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}


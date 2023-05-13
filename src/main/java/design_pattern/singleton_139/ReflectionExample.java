package design_pattern.singleton_139;

import design_pattern.singleton_138.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionExample {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = null;

        try {
            // Get the Singleton class
            Class<Singleton> singletonClass = Singleton.class;

            // Get the private constructor
            Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();

            // Make the private constructor accessible
            constructor.setAccessible(true);

            // Create a new instance using reflection
            singleton2 = constructor.newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(singleton1 == singleton2); // Output: false (Two different instances)
    }
}


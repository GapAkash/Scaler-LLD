package design_pattern.singleton_139.serialization;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {
    private static final long serialVersionUID = 1L;
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation from outside the class
    }

    //solving the issue
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


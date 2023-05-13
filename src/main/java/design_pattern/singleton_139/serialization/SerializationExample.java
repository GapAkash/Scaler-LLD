package design_pattern.singleton_139.serialization;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = null;

        // Serialize the Singleton object
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            out.writeObject(singleton1);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the Singleton object
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
            singleton2 = (Singleton) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(singleton1 == singleton2); // Output: false (Two different instances)
    }
}


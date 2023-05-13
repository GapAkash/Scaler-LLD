package design_pattern.singleton_138;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
/* problems with this structure
1. Application might create multiple objects in multithreaded environment i.e. concurrency issues, etc */

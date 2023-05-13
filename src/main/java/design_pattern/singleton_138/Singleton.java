package design_pattern.singleton_138;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }
}
/* problems with this structure
1. We are doing Eager initialization which makes application startup time slow
2. Application might create multiple objects in multithreaded environment, etc */

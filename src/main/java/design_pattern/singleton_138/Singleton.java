package design_pattern.singleton_138;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }
}

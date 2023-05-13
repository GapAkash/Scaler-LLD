package design_pattern.singleton_138;

public class SingletonEagerInitialization {

    //Eager Initialization
    private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();

    private SingletonEagerInitialization(){

    }

    public static SingletonEagerInitialization getInstance(){
        /* solving the problem of concurrency in the worst way possible. Basically even if 2 threads calls getInstance method,
        then also same object will be shared */
        return instance;
    }
}
/* problems with this structure
1. We are doing Eager initialization which makes application startup time slow
2. This is not the ideal way to deal with concurrency issue via Eager Initialization */

package design_pattern.singleton_139;

public class SingletonSyncMethod1 {

    //Eager Initialization
    private static SingletonSyncMethod1 instance = null;

    private SingletonSyncMethod1() {

    }

    //solving the concurrency problem in a better way
    public synchronized static SingletonSyncMethod1 getInstance() {
        if (instance == null) {
            instance = new SingletonSyncMethod1();
        }
        return instance;
    }
}
/* problems with this structure
1. Since, locks needs to acquire every time getInstance gets called, the application will be slower */

package design_pattern.singleton_139;

public class SingletonSyncBlock2 {

    //Eager Initialization
    private static SingletonSyncBlock2 instance = null;

    private SingletonSyncBlock2() {

    }

    public static SingletonSyncBlock2 getInstance() {
        if (instance == null) {
            //solving the taking lock issue, not every request needs to acquire lock thus no performance impact
            // NOTE - we cannot create sync block for instance because at first it will be null so it'll throw NPE
            // sync(this) is also not recommended
            synchronized (SingletonSyncBlock2.class) {
                instance = new SingletonSyncBlock2();
            }
        }
        return instance;
    }
}
/* problems with this structure
1. There might be an occurrence where 2 thread might gets the lock of sync block, thus creating multiple objects */

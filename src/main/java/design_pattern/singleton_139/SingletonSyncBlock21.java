package design_pattern.singleton_139;

public class SingletonSyncBlock21 {

    //Eager Initialization
    private static SingletonSyncBlock21 instance = null;

    private SingletonSyncBlock21() {

    }

    public static SingletonSyncBlock21 getInstance() {
        if (instance == null) {
            synchronized (SingletonSyncBlock21.class) {
                //solving the multiple thread acquiring the lock using double-check locking mechanism
                if (instance == null)
                    instance = new SingletonSyncBlock21();
            }
        }
        return instance;
    }
}

// double check locking is industry-wide recommended solution for concurrency

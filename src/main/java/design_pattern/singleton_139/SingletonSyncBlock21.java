package design_pattern.singleton_139;

public class SingletonSyncBlock21 {

    private SingletonSyncBlock21() {

    }

    private static final class InstanceHolder {
        //Eager Initialization
        private static final SingletonSyncBlock21 instance = new SingletonSyncBlock21();
    }

    public static SingletonSyncBlock21 getInstance() {
        //solving the multiple thread acquiring the lock using double-check locking mechanism
        return InstanceHolder.instance;
    }
}

// double check locking is industry-wide recommended solution for concurrency

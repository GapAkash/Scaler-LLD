package design_pattern;

import design_pattern.singleton_139.SingletonSyncMethod1;

public class SingletonMain {
    public static void main(String[] args) {
        /*Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();*/

        SingletonSyncMethod1 instance1 = SingletonSyncMethod1.getInstance();
        SingletonSyncMethod1 instance2 = SingletonSyncMethod1.getInstance();

        System.out.println(instance1 == instance2);
    }
}

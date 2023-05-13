package design_pattern;

public class SingletonIdealSolution {
    private SingletonIdealSolution() {

    }

    private static final class InstanceHolder {
        private static final SingletonIdealSolution INSTANCE = new SingletonIdealSolution();
    }

    public static SingletonIdealSolution getInstance() {
        return InstanceHolder.INSTANCE;
    }
}

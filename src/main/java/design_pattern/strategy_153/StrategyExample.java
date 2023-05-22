package design_pattern.strategy_153;

// Strategy
interface SortingStrategy {
    void sort(int[] array);
}

// Concrete Strategies
class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Bubble Sort");
        // Bubble sort implementation
    }
}

class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Quick Sort");
        // Quick sort implementation
    }
}

// Context
class SortContext {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void performSort(int[] array) {
        strategy.sort(array);
    }
}

// Client
public class StrategyExample {
    public static void main(String[] args) {
        int[] array = {5, 2, 7, 1, 9};

        SortContext context = new SortContext();

        context.setStrategy(new BubbleSortStrategy());
        context.performSort(array);

        context.setStrategy(new QuickSortStrategy());
        context.performSort(array);
    }
}


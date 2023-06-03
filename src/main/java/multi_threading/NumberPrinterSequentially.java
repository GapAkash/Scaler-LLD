package multi_threading;

class NumberPrinterClass implements Runnable {
    private static int number = 1; // Shared number variable
    private static final Object lock = new Object(); // Lock object for synchronization
    private boolean isEvenThread;

    public NumberPrinterClass(boolean isEvenThread) {
        this.isEvenThread = isEvenThread;
    }

    @Override
    public void run() {
        while (number <= 20) {
            synchronized (lock) {
                // Check if the current thread should print the number
                if ((number % 2 == 0 && isEvenThread) || (number % 2 != 0 && !isEvenThread)) {
                    System.out.println(Thread.currentThread().getName() + ": " + number++);
                    lock.notify(); // Notify the other thread to continue
                } else {
                    try {
                        lock.wait(); // Wait for the other thread to print
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class NumberPrinterSequentially {
    public static void main(String[] args) {
        NumberPrinterClass oddPrinter = new NumberPrinterClass(false);
        NumberPrinterClass evenPrinter = new NumberPrinterClass(true);

        Thread oddThread = new Thread(oddPrinter);
        Thread evenThread = new Thread(evenPrinter);

        oddThread.start();
        evenThread.start();
    }
}


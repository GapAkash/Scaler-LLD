/**
 * 
 */
package scaler.thread.adderSubtractor;

/**
 * @author Akash.Gupta
 *
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClientMain {

    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        count.value = 0;

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(adder);
        executorService.execute(subtractor);

        executorService.shutdown();
        executorService.awaitTermination(100L, TimeUnit.MINUTES);

        System.out.println(count.value);

    }
}

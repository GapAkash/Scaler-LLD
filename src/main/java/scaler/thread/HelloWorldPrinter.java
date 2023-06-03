/**
 * 
 */
package scaler.thread;

/**
 * @author Akash.Gupta
 *
 */
public class HelloWorldPrinter implements Runnable {

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread " + threadName + ": Hello World from Thread");
	}

}

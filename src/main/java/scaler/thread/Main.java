/**
 * 
 */
package scaler.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Akash.Gupta
 *
 */
public class Main {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//print Hello World in different Thread
//		HelloWorldPrinter hwp = new HelloWorldPrinter();
//		hwp.run();
//		Thread thread = new Thread(hwp);
//	    thread.start();
		
		//Print Odd and even from 1 to 100 in different thread
//		OddPrinter op = new OddPrinter();
//		EvenPrinter ep = new EvenPrinter();
//		Thread odd = new Thread(op);
//		Thread even = new Thread(ep);
//		odd.start();
//		even.start();
		
		//Printer 1 to 100 each in different thread
//		for(int i=1; i<=100; i++) {
//			NumberPrinter np = new NumberPrinter(i);
//			Thread thread = new Thread(np);
//			thread.start();
//		}
		//You might notice that the numbers are not printed in order that's because all the threads have been started at once.
		//But running the thread is totally depends on the CPU scheduler
		
		//Printer 1 to 100 each in different thread but sequentially
		for(int i=1; i<=100; i++) {
			NumberPrinter np = new NumberPrinter(i);
			Thread thread = new Thread(np);
			thread.start();
			thread.join();
		}
		
		//print 1 to 100 using executor
//		ExecutorService execute = Executors.newFixedThreadPool(10);
//		for (int i = 1; i <= 100; i++) {
//			NumberPrinter np = new NumberPrinter(i);
//			execute.execute(np);
//		}
		
		//print 1 to 100 using executor sequentially
//		ExecutorService execute = Executors.newFixedThreadPool(10);
////		ExecutorService execute = Executors.newCachedThreadPool();
//		for (int i = 1; i <= 100; i++) {
//			NumberPrinter np = new NumberPrinter(i);
//			Future<?> future = execute.submit(np);
//			future.get();
//		}
	}

}

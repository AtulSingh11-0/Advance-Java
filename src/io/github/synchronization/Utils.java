package io.github.synchronization;

/**
 * @author cocat
 * @created 13-08-2024 - 06:19 pm
 * @package-name io.github.synchronization
 * @project Advance-Java
 */
public class Utils {
	void multiply ( int n ) throws InterruptedException {
		synchronized ( this ) {
			for ( int i = 1; i <= 5; ++i ) {
				System.out.println(n + " * " + i + " = " + n * i);
				Thread.sleep((long) i * 1000);
			}
		}
	}
}
/*
* when we run the above code, with Thread.sleep(), the output will be:
* it will be sequential, i.e. Depending on the order of the thread, the output will be printed.
*
* and when we run the above code, with wait(), the output will be:
* it will be in a synchronized manner, i.e. the output will be printed in a synchronized manner.
* 5 * 1 = 5
* 10 * 1 = 10
* 5 * 2 = 10
* 10 * 2 = 20
* ....
*
* it happens because the wait() method is used to pause the current thread and wait for another thread to invoke the notify() method or the notifyAll() method.
*
* */
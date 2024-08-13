package io.github.threads;

/**
 * @author cocat
 * @created 13-08-2024 - 05:58 pm
 * @package-name io.github.threads
 * @project Advance-Java
 */
public class Thread2 implements Runnable {

	@Override
	public void run () {
		try {
			System.out.println("Thread 2 is running");
		} catch ( Exception e ) {
			System.out.println(e.getMessage());
		}
	}

}

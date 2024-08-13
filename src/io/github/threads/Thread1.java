package io.github.threads;

/**
 * @author cocat
 * @created 13-08-2024 - 05:54 pm
 * @package-name io.github.threads
 * @project Advance-Java
 */
public class Thread1 extends Thread {

	@Override
	public void run () {
		try {
			System.out.println("Thread 1 is running");
		} catch ( Exception e ) {
			System.out.println(e.getMessage());
		}
	}

}

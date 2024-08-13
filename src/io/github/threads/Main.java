package io.github.threads;

/**
 * @author cocat
 * @created 13-08-2024 - 05:58 pm
 * @package-name io.github.threads
 * @project Advance-Java
 */
public class Main {

	public static void main ( String[] args ) {
		for ( int i = 0; i < 10; ++i ) {
			Thread1 t1 = new Thread1();
			t1.start();

			Thread t2 = new Thread( new Thread2() );
			t2.start();

			// Thread2 t2 = new Thread2();
			// t2.run();

			/*
			* both the above methods will run the thread2 class
			* but the difference is that the first one will run the thread2 class in a new thread
			* and the second one will run the thread2 class in the main thread
			* */
		}
	}

}

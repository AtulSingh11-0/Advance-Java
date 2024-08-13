package io.github.synchronization;

/**
 * @author cocat
 * @created 13-08-2024 - 06:25 pm
 * @package-name io.github.synchronization
 * @project Advance-Java
 */
public class Main {
	public static void main ( String[] args ) {
		Utils utils = new Utils();

		Thread1 thread1 = new Thread1(utils);
		Thread2 thread2 = new Thread2(utils);
		thread1.start();
		thread2.run();
	}
}
/*
* The synchronized block is used to lock an object for any shared resource.
* When a thread enters the synchronized block, it acquires the lock and when it leaves the synchronized block, it releases the lock.
* we can add the synchronized block to the method or the block of code. depending on the requirement.
* if we add the synchronized block to the method, then the whole method will be locked.
* if we add the synchronized block to the block of code, then only that block of code will be locked.
*
* but be careful while using the synchronized block, because it can cause a deadlock. resulting in the program to hang.
* We must use the synchronized block only when it is necessary. because it can slow down the program.
*
* */
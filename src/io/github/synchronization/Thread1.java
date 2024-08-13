package io.github.synchronization;

/**
 * @author cocat
 * @created 13-08-2024 - 06:22 pm
 * @package-name io.github.synchronization
 * @project Advance-Java
 */
public class Thread1 extends Thread {

	private final Utils utils;

	public Thread1 ( Utils utils ) {
		this.utils = utils;
	}

	@Override
	public void run () {
		try {
			utils.multiply(5);
		} catch ( Exception e ) {
			System.out.println(e.getMessage());
		}
	}
}

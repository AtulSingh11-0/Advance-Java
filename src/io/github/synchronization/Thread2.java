package io.github.synchronization;

/**
 * @author cocat
 * @created 13-08-2024 - 06:24 pm
 * @package-name io.github.synchronization
 * @project Advance-Java
 */
public class Thread2 implements Runnable {

	private final Utils utils;

	public Thread2 ( Utils utils ) {
		this.utils = utils;
	}

	@Override
	public void run () {
		try {
			utils.multiply(10);
		} catch ( Exception e ) {
			System.out.println(e.getMessage());
		}
	}
}

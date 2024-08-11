package io.github.annotations;

import java.lang.reflect.Method;

/**
 * @author cocat
 * @created 11-08-2024 - 08:32 PM
 * @package-name io.github.annotations
 * @project Advance-Java
 */
public class Main {

	@CustomAnnotation(name = "magnus", value = 20) // custom annotation with values
	public void method() {
		System.out.println("Method");
	}

	public static void main ( String[] args ) {
		Main main = new Main();
		try {
			Method method = main.getClass().getMethod("method"); // getting the method by name using reflection API
			CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class); // getting the annotation
			System.out.println( "Name: " + annotation.name() + ", Value: " + annotation.value() ); // printing the values
			main.method();
		} catch ( NoSuchMethodException ex ) {
			System.out.println("Method not found");
		}
	}
}

package io.github.enums;

/**
 * @author cocat
 * @created 07-08-2024 - 11:23 AM
 * @package-name io.github.enums
 * @project Advance-Java
 */
public class Main {
	public static void main ( String[] args ) {
		Animal chicken = Animal.CHICKEN; // create an instance of the enum Animal
		System.out.println(chicken); // print the instance
		System.out.println(chicken.getDescription()); // print the description of the instance
		System.out.println(chicken.getSound()); // print the sound of the instance
		System.out.println(chicken.getLimbs()); // print the number of limbs of the instance

		for ( Animal animal : Animal.values() ) { // iterate through all the instances of the enum Animal
			print(animal); // print the instance
		}
	}

	private static void print ( Animal animal ) {
		switch ( animal ) {
			case DOG, COW, CAT, CHICKEN, FISH -> System.out.println(animal);
			default -> System.out.println("Unknown animal");
		}
	}
}

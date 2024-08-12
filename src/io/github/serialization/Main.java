package io.github.serialization;

/**
 * @author cocat
 * @created 12-08-2024 - 12:02 pm
 * @package-name io.github.serialization
 * @project Advance-Java
 */
public class Main {

	private static final String FILE_PATH = "src/io/github/serialization/student.ser";

	public static void main ( String[] args ) {
		Student atul = new Student("atul", 20, "India"); // create a student object
		atul.setPassword("12345"); // set the password
		Converter.serializer(FILE_PATH, atul); // serialize the object
		System.out.println("Password before deserialization: " + atul.getPassword()); // print the password
		Student deserializedObject = Converter.deserializer(FILE_PATH); // deserialize the object

		if ( deserializedObject == null ) { // check if deserialization failed
			System.out.println("Deserialization failed..."); // print the message
		} else {
			System.out.println("Student object after deserialization: " + deserializedObject); // print the student object
			System.out.println("Password after deserialization: " + deserializedObject.getPassword()); // print the password
		}
	}
}

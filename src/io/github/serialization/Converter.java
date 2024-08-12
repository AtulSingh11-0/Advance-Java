package io.github.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author cocat
 * @created 12-08-2024 - 11:56 am
 * @package-name io.github.serialization
 * @project Advance-Java
 */
public class Converter {

	private Converter () {} // private constructor

	public static void serializer (
			String filePath, // file path where the object will be serialized
			Student student // object to serialize
	) {
		try (
				FileOutputStream fileOutputStream = new FileOutputStream(filePath); // file output stream
				ObjectOutputStream objectOutputStream = new ObjectOutputStream( fileOutputStream ) // object output stream
				) { // try with resources
			System.out.println("Serialization started..."); // print the message
			System.out.println("Student object to serialize: " + student); // print the student object
			objectOutputStream.writeObject( student ); // write the object to the file
			System.out.println("Serialization completed..."); // print the message
		} catch ( Exception e ) { // catch block
			System.out.println(e.getMessage()); // print the exception message
		}
	}

	public static Student deserializer (
			String filePath // file path from where the object will be deserialized
	) {
		try (
				FileInputStream fileInputStream = new FileInputStream( filePath ); // file input stream
				ObjectInputStream objectInputStream = new ObjectInputStream( fileInputStream ) // object input stream
				) { // try with resources
			System.out.println("Deserialization started..."); // print the message
			Student student = (Student) objectInputStream.readObject(); // read the object from the file
			System.out.println("Deserialization in progress..."); // print the message
			System.out.println("Deserialization completed..."); // print the message
			return student; // return the student object
		} catch ( Exception e ) { // catch block
			System.out.println(e.getMessage()); // print the exception message
		}
		return null; // return null if deserialization fails
	}

}

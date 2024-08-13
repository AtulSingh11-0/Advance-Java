package io.github.jdbc;

import org.jetbrains.annotations.Nullable;

import java.sql.*;

/**
 * @author cocat
 * @created 13-08-2024 - 10:23 pm
 * @package-name io.github.jdbc
 * @project Advance-Java
 */
public class Main {

	// JDBC driver name and database URL
	private static final String URL = "jdbc:postgresql://localhost:5432/test_db";

	// Database credentials
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "12345";
	
	public static void main ( String[] args ) {
		try ( Connection connection = DriverManager.getConnection( URL, USERNAME, PASSWORD ) ) { // try-with-resources
			System.out.println("Connection established"); // Connection established
			insert( connection ); // insert method to insert data into students table
			select( connection ); // select method to select data from students table
		} catch ( Exception e ) {
			System.out.println("Exception caught: " + e.getMessage()); // Exception caught
		}
		System.out.println("Connection closed"); // Connection closed
	}

	/*
	* function to insert data into students table
	* */
	public static void insert ( Connection connection ) {
		// insert data into students table
		String insertStatement = """
				INSERT INTO
				    students (name, age)
				VALUES ( 'Simran', 20 ),
				    ( 'Dev', 19 ),
				    ( 'Arka Deep', 22 )
				"""; // SQL query to insert data into students table
		boolean insertResult = insertHandler(connection, insertStatement); // calling insertHandler method
		if ( insertResult ) { // if data inserted successfully
			System.out.println("Data inserted successfully"); // Data inserted successfully
		} else { // if data insertion failed
			System.out.println("Data insertion failed"); // Data insertion failed
		}
	}

	/*
	* function to select data from students table
	* */
	public static void select ( Connection connection ) throws SQLException {
		// select data from students table
		String selectStatement = "SELECT * FROM students"; // SQL query to select data from students table
		ResultSet selectResult = selectHandler(connection, selectStatement); // calling selectHandler method
		if ( selectResult != null ) { // if data selected successfully
			System.out.println("Data selected successfully"); // Data selected successfully
			while ( selectResult.next() ) { // iterate over the result set
				System.out.println(
						"ID: " + selectResult.getInt("id") +
								", Name: " + selectResult.getString("name") +
								", Age: " + selectResult.getInt("age")
				); // print the data
			}
		} else { // if data selection failed
			System.out.println("Data selection failed"); // Data selection failed
		}
	}

	/*
	* function to execute insert query
	* */
	public static boolean insertHandler ( Connection connection, String insertSql ) {
		try ( Statement statement = connection.createStatement() ) { // try-with-resources
			int rowsAffected = statement.executeUpdate(insertSql); // execute the insert query
			return rowsAffected > 0; // return true if rows affected is greater than 0
		} catch ( SQLException e ) { // catch block to catch SQLException
			System.out.println(e.getMessage()); // Exception caught
			return false; // return false
		}
	}

	/*
	* function to execute select query
	* */
	@Nullable
	public static ResultSet selectHandler ( Connection connection, String selectSql ) {
		try { // try block to catch SQLException
			Statement statement = connection.createStatement(); // create a statement object
			return statement.executeQuery(selectSql); // return the result set
		} catch ( SQLException e ) { // catch block to catch SQLException
			System.out.println(e.getMessage()); // Exception caught
			return null; // return null
		}
	}
}

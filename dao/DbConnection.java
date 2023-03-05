/**
 * 
 */
package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.dao.exception.DbException;

/**
 * @author Candace Samuels
 *
 */
public class DbConnection {

	private static final String SCHEMA = "projects";
	private static final String USER = "projects";
	private static final String PASSWORD = "projects";
	private static final String HOST = "localhost";
	private static final int PORT = 3306;

	public static Connection getConnection() {
		// create a URL
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false", HOST, PORT, SCHEMA, USER,
				PASSWORD);

		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Connection to schema '" + SCHEMA + "' is successful!");
			return conn;
		} catch (SQLException e) {
			System.out.println("Unable to get connection at " + url);
			throw new DbException();
			// create an unchecked exception class from the runtime exception superclass

		}
	}
}
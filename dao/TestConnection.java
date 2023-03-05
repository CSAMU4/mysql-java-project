/**
 * 
 */
package projects.dao;

import java.sql.Connection;
import java.sql.SQLException;
import projects.dao.exception.DbException;

/**
 * @author Candace Samuels
 *
 */
public class TestConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DbConnection.getConnection();

	}

}

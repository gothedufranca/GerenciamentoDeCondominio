package br.com.cotemig.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public abstract class Connect {
	
@SuppressWarnings("unused")
private static Connection connection = null;
	
	public static Connection getConnection(Connection connection){
		try {
			if(connection == null || connection.isClosed()){
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:xe", "sys as sysdba", "toor");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
}

package br.com.cotemig.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexoes {

	private static Connection connection = null;

	public static Connection Conexao(){

		try {
			if(connection == null || connection.isClosed()){
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection(
						"jdbc:oracle:thin:@186.249.13.156:1521:xe", "a71501126", "a71501126");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
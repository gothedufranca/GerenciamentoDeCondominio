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
						"jdbc:oracle:thin:@oracle_ip:oracle_port:oracle_type", "user", "pass");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
}

package br.com.cotemig.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UseDataBase extends FabricaConexoes {
	private static Connection connection = null;
	
	public static boolean insereConta(String cnpj, String cpf, String data, double valor){
		boolean test = false;
		try {
			if (connection == null || connection.isClosed())
				FabricaConexoes.getConnection(connection);
			PreparedStatement ps;
			String sql = "insert into conta (cnpj, cpf, data, valor) values (?, ?, ?, ?)";
			ps = connection.prepareStatement(sql);
			ps.setString(1, cnpj);
			ps.setString(2, cpf);
			ps.setString(3, data);
			ps.setDouble(4, valor);
			ps.execute();
			ps = connection.prepareStatement("commit");
			ps.execute();
			test = true;
		} catch (SQLException | NullPointerException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return test;
	}
}










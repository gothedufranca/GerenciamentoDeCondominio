package br.com.cotemig.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import br.com.cotemig.classesbase.Morador;

public class MoradorDAO {

	private Connection con;

	public MoradorDAO(Connection con) {
		this.con = con;

	}

	/**
	 * Cria um novo morador
	 *
	 * @param morador
	 */
	public boolean salvar(Morador morador) throws SQLException {

		String nome = morador.getNome();
		String cpf = morador.getCpf();
		String situacao = morador.getSituacao();
		String sql = "insert into MORADOR ( NOME, CPF, SITUACAO) values ( ? , ? , ? )";
		try {

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setString(1, nome);
			ps.setString(2, cpf);
			ps.setString(3, situacao);

			ps.execute();
			JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
			JOptionPane.showMessageDialog(null, "Erro ao criar Novo Usuário");
		}
		return false;
	}

	/**
	 * Atualiza nome, cpf e situação do morador
	 *
	 * @param morador
	 */
	public void atualizar(Morador morador) {

		String cpf = morador.getCpf();
		String nome = morador.getNome();
		String situacao = morador.getSituacao();
		String sql = "update MORADOR set CPF = ? , NOME =  ?  WHERE CPF = ?";

		try {
			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setString(1, cpf);
			ps.setString(2, nome);
			ps.setString(3, cpf);
			ps.execute();
			JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso.");

		} catch (SQLException ex) {
			Logger.getLogger(MoradorDAO.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	/**
	 * Exclui o morador com o cpf do parametro
	 *
	 * @param cpf
	 */
	public boolean excluir(String cpf) {

		String cpf1 = cpf;

		String sql = "DELETE MORADOR WHERE CPF = ?";
		try {

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setString(1, cpf1);

			ps.execute();
			JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso");
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
			JOptionPane.showMessageDialog(null, "Erro ao excluir morador");
		}
		return false;
	}

	/**
	 * Retorna todos os moradores cadastrados
	 *
	 * @return List <Morador>
	 */
	public List<Morador> consultar() {
		ArrayList<Morador> lista = new ArrayList<>();
		String sql = "SELECT * FROM MORADOR";
		try {

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.execute();
			ResultSet rs = ps.executeQuery(sql);

			while (rs.next()) {
				Morador morador = new Morador();
				morador.setNome(rs.getString("NOME"));
				morador.setCpf(rs.getString("CPF"));
				morador.setSituacao(rs.getString("SITUACAO"));
				lista.add(morador);

			}

		} catch (SQLException ex) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
			JOptionPane.showMessageDialog(null, "Erro ao excluir morador");
		}
		return lista;
	}

	/**
	 * Consulta o morador pelo cpf
	 *
	 * @param cpf
	 *
	 * @return Retorna um Morador com o cpf informado
	 */
	public Morador consultar(String cpf) {
		String cp = cpf;
		Morador morador = new Morador();
		String sql = "SELECT * FROM MORADOR WHERE CPF = ?";
		try {

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setString(1, cp);

			ps.execute();
			ResultSet rs = ps.executeQuery(sql);
			if (rs.next()) {
				morador.setNome(rs.getString("NOME"));
				morador.setCpf(rs.getString("CPF"));
				morador.setSituacao(rs.getString("SITUACAO"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
			JOptionPane.showMessageDialog(null, "Erro ao excluir morador");
		}
		return morador;
	}
}

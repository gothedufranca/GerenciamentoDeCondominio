package br.com.cotemig.persistence;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;
@SuppressWarnings("unused")
public class LeTxt {
	private String cnpj;
	private String cpf;
	private String data;
	private double valor;
	
	private Connection connection = null;
	
	public void setValues() {
		try {
			String message = "Insira o nome do documento de texto que contém os dados.\n"
					+ "O mesmo deve estar salvo no Desktop (Área de Trabalho) para poder"
					+ " ser localizado pelo sistema.\nNão é necessário digitar a extensã"
					+ "o do arquivo (.txt).";
			String file = "txt"; //JOptionPane.showInputDialog(message);
			FileInputStream stream = new FileInputStream(System.getProperty("user.home") + "\\Desktop\\" + file + ".txt");
			InputStreamReader reader = new InputStreamReader(stream);
			BufferedReader br = new BufferedReader(reader);
			String linha = br.readLine();
			if(linha.length() != 39){
				JOptionPane.showMessageDialog(null, "Informações inválidas, favor tentar novamente.");
			}else{
				this.cnpj = linha.substring(0, 14);
				this.cpf = linha.substring(14, 25);
				this.data = linha.substring(25, 31);
				this.valor = Double.parseDouble(linha.substring(31, 39))/100;
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}/*finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}*/
	}
	
	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	
	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}
	
}

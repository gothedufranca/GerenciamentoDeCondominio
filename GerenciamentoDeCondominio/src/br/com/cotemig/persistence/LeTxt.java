package br.com.cotemig.persistence;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFileChooser;
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
			JFileChooser select = new JFileChooser();
			int result = select.showOpenDialog(null);
			String path = null;
			if (result == JFileChooser.APPROVE_OPTION)
				path = select.getSelectedFile().getAbsolutePath();
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String row = br.readLine();
			if(row.length() != 39){
				JOptionPane.showMessageDialog(null, "Informações inválidas, favor tentar novamente.");
			}else{
				this.cnpj = row.substring(0, 14);
				this.cpf = row.substring(14, 25);
				this.data = row.substring(25, 31);
				this.valor = Double.parseDouble(row.substring(31, 39))/100;
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
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

package br.com.cotemig.classesbase;


@SuppressWarnings("unused")
public class Conta {
	private String cnpj = null;
	private String cpf = null;
	private String data = null;
	private double valor = 0.0;
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}

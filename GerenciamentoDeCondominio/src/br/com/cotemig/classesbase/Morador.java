package br.com.cotemig.classesbase;

public class Morador {

	private String cpf = null;
	private String nome = null;
	private String condominio = null;
	private String apartamento = null;
	private String situacao;
	private double valorCondominio;

	public Morador(){

	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the condominio
	 */
	public String getCondominio() {
		return condominio;
	}
	/**
	 * @param condominio the condominio to set
	 */
	public void setCondominio(String condominio) {
		this.condominio = condominio;
	}
	/**
	 * @return the apartamento
	 */
	public String getApartamento() {
		return apartamento;
	}
	/**
	 * @param apartamento the apartamento to set
	 */
	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}
	/**
	 * @return the situacao
	 */
	public String getSituacao() {
		return situacao;
	}
	/**
	 * @param situacao the situacao to set
	 */
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	/**
	 * @return the valorCondominio
	 */
	public double getValorCondominio() {
		return valorCondominio;
	}
	/**
	 * @param valorCondominio the valorCondominio to set
	 */
	public void setValorCondominio(double valorCondominio) {
		this.valorCondominio = valorCondominio;
	}


}

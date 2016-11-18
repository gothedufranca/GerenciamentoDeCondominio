package br.com.cotemig.main;

import br.com.cotemig.persistence.LeTxt;

public class Main {

	public static void main(String[] args) {
		LeTxt dados = new LeTxt();
		dados.setValues();
		System.out.println(dados.getCnpj());
		System.out.println(dados.getCpf());
		System.out.println(dados.getData());
		System.out.println(dados.getValor());
	}
}

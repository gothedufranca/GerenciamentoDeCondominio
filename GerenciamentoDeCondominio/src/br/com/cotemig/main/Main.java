package br.com.cotemig.main;

import br.com.cotemig.persistence.LeTxt;
import br.com.cotemig.persistence.UseDataBase;

public class Main {

	public static void main(String[] args) {
		LeTxt dados = new LeTxt();
		dados.setValues();
		boolean x = UseDataBase.insereConta(dados.getCnpj(), dados.getCpf(), dados.getData(), dados.getValor());
		if (x)
			System.out.println("Ok");
		else
			System.out.println("Bad");
	}
}

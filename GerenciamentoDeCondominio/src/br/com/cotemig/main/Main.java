package br.com.cotemig.main;

import br.com.cotemig.persistence.LeTxt;

public class Main {
	public static void main(String[] args) {
		String path = "123456789012341234567890112345612345678";
		if(LeTxt.readFile(LeTxt.openFile()).equals(path))
			System.out.println("ok");
		else
			System.out.println("bad");
	}
}

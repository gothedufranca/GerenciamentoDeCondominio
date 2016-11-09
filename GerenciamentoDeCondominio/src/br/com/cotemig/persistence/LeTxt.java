package br.com.cotemig.persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

public class LeTxt {

	public static String openFile() {
		JFileChooser jfc = new JFileChooser();
		int dialog = jfc.showOpenDialog(null);
		String path = null;
		if (dialog == JFileChooser.APPROVE_OPTION) {
			path = jfc.getSelectedFile().getAbsolutePath();
		}
		return path;
	}

	public static String readFile(String path) {
		String linha = null;
		try {
			FileReader arq = new FileReader(path);
			BufferedReader lerArq = new BufferedReader(arq);
			linha = lerArq.readLine();
			arq.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return linha;
	}
}
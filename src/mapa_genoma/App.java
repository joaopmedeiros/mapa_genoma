package mapa_genoma;

import java.io.File;
import java.io.FileNotFoundException;

public class App {
	public static void main(String args[]){
		AbrirArquivo lf = AbrirArquivo.getInstance();
		try {
			lf.inicializa(new File("sequence.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!!");
		}
	}
}

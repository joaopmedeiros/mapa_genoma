package mapa_genoma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class App {
	public static void main(String args[]){
		AbrirArquivo lf = AbrirArquivo.getInstance();
		try {
			ArrayList<Gene> genes = lf.inicializa(new File("sequence.txt"));
			genes.get(0).geracodons1();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!!");
		}
	}
}

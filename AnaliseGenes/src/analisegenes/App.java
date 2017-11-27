package mapa_genoma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class App {
	public static void main(String args[]){
		AbrirArquivo lf = AbrirArquivo.getInstance();
		try {
			ArrayList<Gene> genes = lf.inicializa(new File("sequence_test.txt"));
			genes.get(0).geraBasesAgrupadas();			
			genes.get(0).geraAminoacidosAgrupados();
			genes.get(0).geraAminoacidoCorreto();
			System.out.println(genes.get(0).toString());
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!!");
		}
	}
}

package mapa_genoma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class App {
	public static void main(String args[]){
		AbrirArquivo lf = AbrirArquivo.getInstance();
		try {
			ArrayList<Gene> genes = lf.inicializa(new File("sequence_test.txt"));
			genes.get(1).geraBasesAgrupadas();			
			genes.get(1).geraAminoacidosAgrupados();
			genes.get(1).geraAminoacidoCorreto();
			System.out.println(genes.get(1).toString());
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!!");
		}
	}
}

package mapa_genoma;
import java.util.ArrayList;
import java.util.Collections;
//  import java.util.ListIterator;

public class Leitura352 extends Leitura532 {
	public Leitura352() {
		super();
	}
	
	@Override
	public ArrayList<String> executarLeitura(ArrayList<Character> basesGeral) {
		ArrayList<String> lista_codons = new ArrayList<String>();		
		Collections.reverse(basesGeral);			
		lista_codons = super.executarLeitura(basesGeral);		
		Collections.reverse(basesGeral);		
		return lista_codons;
	}
	

}


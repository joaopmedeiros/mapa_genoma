package mapa_genoma;
import java.util.ArrayList;

public class Gene {
	private String locus;
	private long pos_ini;
	private long pos_final;
	private ArrayList<Character> basesGeral;
	private ArrayList<String> baseCorreta;
	private ArrayList<String> basesAgrupadas;
	private ArrayList<Leituras> leituras;
	
	public Gene(String locus, long pos_ini, long pos_final, ArrayList<Character> basesGeral) {
		this.locus = locus;
		this.pos_ini = pos_ini;
		this.pos_final = pos_final;
		this.basesGeral = basesGeral;
		this.baseCorreta = new ArrayList<String>();
		this.basesAgrupadas = new ArrayList<String>();
		this.leituras = new ArrayList<Leituras>();
	}
	
	@Override
	public String toString() {
		return 
				"Locus = " + locus + " Posicao Inicial = "+ pos_ini+ " Posicao Final = " + pos_final +"\n" +
				"Sequencia = " + basesGeral;
	}
	
	
	public void testandogeracodons() {
		AminoacidTables a = AminoacidTables.getInstance();
		Leitura1 leitura1 = new Leitura1();
		Leitura2 leitura2 = new Leitura2();
		Leitura3 leitura3 = new Leitura3();
		ArrayList<Leituras> leituras = new ArrayList<Leituras>();
		leituras.add(leitura1);
		leituras.add(leitura2);
		leituras.add(leitura3);
		
		for(Leituras l: leituras) {
			System.out.println("Executando: "+l.getClass());
			ArrayList<String> lista_codons = l.executarLeitura(basesGeral);
			for(String codon: lista_codons) {
				System.out.println(codon+" = "+a.getAminoacid(codon));					
			}	
		}
		
		
		
				
				
			
	}
		

}

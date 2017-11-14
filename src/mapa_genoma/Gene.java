package mapa_genoma;
import java.util.ArrayList;

public class Gene {
	private String locus;
	private long pos_ini;
	private long pos_final;
	private ArrayList<Character> basesGeral;
	private ArrayList<String> baseCorreta;
	private ArrayList<String> basesAgrupadas;
	private ArrayList<Leitura> leituras;
	
	public Gene(String locus, long pos_ini, long pos_final, ArrayList<Character> basesGeral) {
		this.locus = locus;
		this.pos_ini = pos_ini;
		this.pos_final = pos_final;
		this.basesGeral = basesGeral;
		this.baseCorreta = new ArrayList<String>();
		this.basesAgrupadas = new ArrayList<String>();
		this.leituras = new ArrayList<Leitura>();
	}
	
	@Override
	public String toString() {
		return 
				"Locus = " + locus + " Posicao Inicial = "+ pos_ini+ " Posicao Final = " + pos_final +"\n" +
				"Sequencia = " + basesGeral;
	}
	
	
	public void testandogeracodons() {
		Leitura1 leitura = new Leitura1();
		ArrayList<String> lista_codons = leitura.executarLeitura(basesGeral);		
		AminoacidTable a = AminoacidTable.getInstance();		
		for(String codon: lista_codons) {
			System.out.println(codon+" = "+a.getAminoacid(codon));					
		}		
	}
		

}

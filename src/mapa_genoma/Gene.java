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
	
	
	public void geracodons1() {
		Leitura1 leitura = new Leitura1();
		System.out.println(leitura.executarLeitura(basesGeral));
		
	}
	
	
	public String getLocus() {
		return locus;
	}
	public void setLocus(String locus) {
		this.locus = locus;
	}
	public long getPos_ini() {
		return pos_ini;
	}
	public void setPos_ini(int pos_ini) {
		this.pos_ini = pos_ini;
	}
	public long getPos_final() {
		return pos_final;
	}
	public void setPos_final(int pos_final) {
		this.pos_final = pos_final;
	}
	public ArrayList<Character> getBasesGeral() {
		return basesGeral;
	}
	public void setBasesGeral(ArrayList<Character> basesGeral) {
		this.basesGeral = basesGeral;
	}
	
	
	
	public ArrayList<String> getBaseCorreta() {
		return baseCorreta;
	}
	public void setBaseCorreta(ArrayList<String> baseCorreta) {
		this.baseCorreta = baseCorreta;
	}
	public ArrayList<String> getBasesAgrupadas() {
		return basesAgrupadas;
	}
	public void setBasesAgrupadas(ArrayList<String> basesAgrupadas) {
		this.basesAgrupadas = basesAgrupadas;
	}
	public ArrayList<Leitura> getLeituras() {
		return leituras;
	}
	public void setLeituras(ArrayList<Leitura> leituras) {
		this.leituras = leituras;
	}
	
	
	
	

}

package mapa_genoma;

import java.util.ArrayList;

public class Gene {
	private String locus;
	private int pos_ini;
	private int pos_final;
	private ArrayList<String> basesGeral;
	private ArrayList<String> baseCorreta;
	private ArrayList<String> basesAgrupadas;
	private ArrayList<Leitura> leituras;
	
	public Gene(String locus, int pos_ini, int pos_final) {
		this.locus = locus;
		this.pos_ini = pos_ini;
		this.pos_final = pos_final;
		this.basesGeral = new ArrayList<String>();
		this.baseCorreta = new ArrayList<String>();
		this.basesAgrupadas = new ArrayList<String>();
		this.leituras = new ArrayList<Leitura>();
	}
	
	public String getLocus() {
		return locus;
	}
	public void setLocus(String locus) {
		this.locus = locus;
	}
	public int getPos_ini() {
		return pos_ini;
	}
	public void setPos_ini(int pos_ini) {
		this.pos_ini = pos_ini;
	}
	public int getPos_final() {
		return pos_final;
	}
	public void setPos_final(int pos_final) {
		this.pos_final = pos_final;
	}
	public ArrayList<String> getBasesGeral() {
		return basesGeral;
	}
	public void setBasesGeral(ArrayList<String> basesGeral) {
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

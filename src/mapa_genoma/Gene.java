package mapa_genoma;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class Gene {
	private String locus;
	private long pos_ini;
	private long pos_final;
	private ArrayList<Character> basesGeral;
	private ArrayList<String> baseCorreta;
	private ArrayList<ArrayList<String>> basesAgrupadas;
	private ArrayList<List<String>> aminoAcidosAgrupados;
	private ArrayList<Leituras> leituras;
	
	public Gene(String locus, long pos_ini, long pos_final, ArrayList<Character> basesGeral) {
		this.locus = locus;
		this.pos_ini = pos_ini;
		this.pos_final = pos_final;
		this.basesGeral = basesGeral;
		this.baseCorreta = new ArrayList<String>();
		this.basesAgrupadas = new ArrayList<ArrayList<String>>();
		this.leituras = new ArrayList<Leituras>();
		this.aminoAcidosAgrupados = new ArrayList<List<String>>();
		
		Leitura1 leitura1 = new Leitura1();
		Leitura2 leitura2 = new Leitura2();
		Leitura3 leitura3 = new Leitura3();
		Leitura4 leitura4 = new Leitura4();
		Leitura5 leitura5 = new Leitura5();
		Leitura6 leitura6 = new Leitura6();
		
		
		leituras.add(leitura1);
		leituras.add(leitura2);
		leituras.add(leitura3);
		leituras.add(leitura4);
		leituras.add(leitura5);
		leituras.add(leitura6);
		
	}
	
	@Override
	public String toString() {
		return 
				"Locus = " + locus + " Posicao Inicial = "+ pos_ini+ " Posicao Final = " + pos_final +"\n" +
				"Sequencia = " + basesGeral +"\n" +
				"Bases agrupadas = " + basesAgrupadas +"\n" +
				"Aminoacidos agrupados = " + aminoAcidosAgrupados;
		
	}
	
	public void geraBasesAgrupadas() {		
		for(Leituras l: leituras) {
			basesAgrupadas.add(l.executarLeitura(basesGeral));
			}	
	}		

	
	
	public void geraAminoacidosAgrupados() {
		AminoacidTables a = AminoacidTables.getInstance();		
		for(ArrayList<String> base: basesAgrupadas) {
			List<String> list_amino = base.stream().map(x->a.getAminoacid(x)).collect(Collectors.toList());
			aminoAcidosAgrupados.add(list_amino);
		}	
		
	}
	
		

}

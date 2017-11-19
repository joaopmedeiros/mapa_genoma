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
	private ArrayList<LeiturasCodons> leituras;
	private ArrayList<ArrayList<String>> basesAgrupadas;
	private ArrayList<ArrayList<String>> aminoAcidosAgrupados;
	private ArrayList<String> baseCorreta;
	
	
	public Gene(String locus, long pos_ini, long pos_final, ArrayList<Character> basesGeral) {
		this.locus = locus;
		this.pos_ini = pos_ini;
		this.pos_final = pos_final;
		this.basesGeral = basesGeral;
		this.leituras = new ArrayList<LeiturasCodons>();
		this.basesAgrupadas = new ArrayList<ArrayList<String>>();
		this.aminoAcidosAgrupados = new ArrayList<ArrayList<String>>();
		this.baseCorreta = new ArrayList<String>();		
	
		leituras.add(new Leitura531());
		leituras.add(new Leitura532());
		leituras.add(new Leitura533());
		leituras.add(new Leitura351());
		leituras.add(new Leitura352());
		leituras.add(new Leitura353());
		
	}
	
	@Override
	public String toString() {
		return 
				"Locus = " + locus + " Posicao Inicial = "+ pos_ini+ " Posicao Final = " + pos_final +"\n" +
				"Sequencia = " + basesGeral +"\n" +
				"Bases agrupadas = " + basesAgrupadas +"\n" +
				"Aminoacidos agrupados = " + aminoAcidosAgrupados +"\n" +
				"Aminoacido correto = "+ baseCorreta ;
		
	}
	
	public void geraBasesAgrupadas() {
		for(LeiturasCodons l: leituras) {
			basesAgrupadas.add(l.executarLeitura(basesGeral));
			}
	}		

	
	
	public void geraAminoacidosAgrupados() {
		AminoacidTables a = AminoacidTables.getInstance();		
		for(ArrayList<String> base: basesAgrupadas) {
			ArrayList<String> list_amino = (ArrayList<String>) base.stream().map(x->a.getAminoacid(x)).collect(Collectors.toList());
			aminoAcidosAgrupados.add(list_amino);
		}	
		
	}
	
	public void geraAminoacidoCorreto() {
		this.baseCorreta = percorreAminoacidos(aminoAcidosAgrupados);
	}
	
	
	
    private ArrayList<String> percorreAminoacidos(ArrayList<ArrayList<String>> aminoacidos) {
    	int maior_distancia = -1;
    	ArrayList<String> lista_amino_correta = null;
    	
    	for(ArrayList<String> lista_amino : aminoacidos) {
    		int cont_distancia = -1;
    		for(String amino : lista_amino) {
    			if(amino.equalsIgnoreCase("Met")) {    				
    				cont_distancia = 0;
    			}
    			if(cont_distancia>-1) {
    				cont_distancia++;
    			}
    			if(amino.equalsIgnoreCase("Stop")) {
    				if(cont_distancia>maior_distancia) {
    	    			maior_distancia = cont_distancia;
    	    			lista_amino_correta = lista_amino;
    	    		}
    				cont_distancia = -1;
    			}
    		}
    		
    	}
    	
    	return lista_amino_correta;
    	
    }
	
		

}

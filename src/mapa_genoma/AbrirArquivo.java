package mapa_genoma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AbrirArquivo {
	private static AbrirArquivo este = null; 
	private File sourceFile;
	private boolean loaded;

	private void loadData() throws FileNotFoundException {
		if (sourceFile == null) return;
		
		Pattern pattern = Pattern.compile("(\\[(.*?)\\])");
		Pattern patloc = Pattern.compile("(\\[location=(\\d+)..(\\d+)\\])");
		Pattern patLocus = Pattern.compile("(\\[locus_tag=(.*?)\\])");

		Scanner data = new Scanner(sourceFile);

		String locus = "";
		long begin = -1;
		long end = -1;
		List<Character> sequence = new ArrayList<>(200);

		// Percorre o arquivo do genoma
		while (data.hasNextLine()) {
			String line = data.nextLine();
			// Se é uma linha de cabeçalho ...
			if (line.length() > 0 && line.charAt(0) == '>') {
				if (begin != -1) { // Se já tem um Gene para montar, monta e armazena
					// Neste exemplo está imprimindo na tela, mas deveria armazenar na estrutura de dados
					System.out.println("Locus: "+locus+", inicio:"+begin+", "+end);
					System.out.println(sequence);
					System.out.println("--------");
					
					locus = "";
					begin = -1;
					end = -1;
					sequence = new ArrayList<>(200);
				}
				Matcher matcher = pattern.matcher(line);
				// Procura pelos dados
				while (matcher.find()) {
					String token = matcher.group(1);
					Matcher matchLoc = patloc.matcher(token);
					if (matchLoc.matches()) {
						begin = Long.parseLong(matchLoc.group(2));
						end = Long.parseLong(matchLoc.group(3));
					} else {
						Matcher matchLocus = patLocus.matcher(token);
						if (matchLocus.matches()) {
							locus = matchLocus.group(2);
						}
					}
				}
			} else { // Se é uma linha de sequencia de gene ...
				for (int i = 0; i < line.length(); i++) {
					sequence.add(line.charAt(i));
				}
			}
		}
		data.close();
		loaded = true;
	}

	private AbrirArquivo(){
		loaded = false;
		sourceFile = null;
	}
	
	public static AbrirArquivo getInstance(){
		if (este == null){
			este = new AbrirArquivo();
		}
		return este;
	}
	
	public void inicializa(File sourceFile) throws FileNotFoundException {
		this.sourceFile = sourceFile;
		this.loadData();
		this.loaded = true;
	}

	public static void main(String args[]){
		AbrirArquivo lf = AbrirArquivo.getInstance();
		try {
			lf.inicializa(new File("H37RvSequence.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!!");
		}
	}
}
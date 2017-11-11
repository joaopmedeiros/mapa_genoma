Projeto feito para a cadeira de Programação Orientada a Objetos, PUCRS.

# Resumo geral e anotacoes:

Genes: sequencia de bases nitrogenadas ou nucleotideos distintos(DNA) que codificam uma determinada sequencia de proteina.
    acidos nucleicos
       DNA
            Adenina
            Citosina
            Guanina
            Timina
        RNA
            Adenina
            Citosina
            Guanina
            Uracila
As sequencias DNA/RNA sao complementare de maneira que se conhecemos uma podemos deduzir a outra
A pareia com T e C pareia com G
Para saber qual é a sequencia correta é preciso identificar qual das sequencias apresenta a maior DISTANCIA entre um aminoacido indicador de inicio do processo de codificacao de um PROTEINA (Met) e um aminoacido do final desste processo (Stop)
Stop Codons TTA,TAG,TGA
A sequência que apresenta maior distância entre um “Met” e um “Stop” é a sequência da linha
2. Portanto, é esta sequência que deve ser considerada como a sequência correta de
aminoácidos.
O agrupamento dos códons pode ser feito a partir da primeira, da segunda ou da terceira letra.

# Palavras-chave:
SEQUENCIAS NAO CODIFICADORAS
NUCLEOTIDEOS = A,C,G,T
CODON = combinacoes de 3 nucleotideos
AMINOACIDO = combinacoes de codons
SEQUENCIA (5'-3') ou (3'-5') = forma de leitura das sequencias de nucleotideos.

# Resultados necessarios do trabalho
1) Locus do Gene
2) Posicao de inicio e fim do gene dentro do genoma
3) Sequancia de bases do gene (tal como lida do arquivo)
4) Sequencia de bases do gene agrupadas em codons (direcao e deslocmaneto indicados)
5) Sequencia de aminoacidos correspondente a sequencia de condons indicada
6) Sequencia correta de aminoacidos
7) Representacao grafia da sequencia de bases (atribuindo cores para as bases)

# Passo a passo mais ou menos
0) Montar esturturas de dados para os aminoacidos
1) Percorrer o arquivo em sequencia de comandos usando como marcador o caracter >
2) Ler as informacoes do cabecalho e armazenar como caracteristicas do objeto gene
3) Armazenar as letrinhas num array
4) Montar as sequencias desses codons usando os 6 tipos de caminhamento dentro do vetor (aqui pode entrar heranca, pois da para generalizar alguma coisa)
5) Decidir com base nas distancias a sequencia correta de aminoacidos
6) Parte gráfica... 

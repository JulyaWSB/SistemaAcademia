package org.serratec.trabalho.modelos;

public class SemDadosRelatorioExcecao extends Exception {
	public SemDadosRelatorioExcecao(String tipo) {
		super("Não há dados suficientes para gerar relatorio de " + tipo);
	}

}

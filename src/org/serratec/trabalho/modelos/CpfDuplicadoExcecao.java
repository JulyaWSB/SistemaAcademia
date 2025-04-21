package org.serratec.trabalho.modelos;

public class CpfDuplicadoExcecao extends Exception {
	public CpfDuplicadoExcecao(String cpf) {
		super("Já existe uma pessoa com o o cpf " +cpf);
	}
	
}

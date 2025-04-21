package org.serratec.trabalho.modelos;

import org.serratec.trabalho.enums.Especialidades;

public class Personal extends Pessoa{
	private String cref;
    private Especialidades especialidade;
    
	public Personal(String nome, String cpf, String senha, String cref, Especialidades especialidade) {
		super(nome, cpf, senha);
		this.cref = cref;
		this.especialidade = especialidade;
	}

}

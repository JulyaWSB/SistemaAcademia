package org.serratec.trabalho.modelos;

import java.time.LocalDate;

public class Aluno extends Pessoa{
	private LocalDate dataMatricula;
    private Plano plano;
    
	public Aluno(String nome, String cpf, String senha, LocalDate dataMatricula, Plano plano) {
		super(nome, cpf, senha);
		this.dataMatricula = dataMatricula;
		this.plano = plano;
	}
}

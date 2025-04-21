package org.serratec.trabalho.modelos;

import java.time.LocalDate;

import org.serratec.trabalho.enums.PlanoEnum;

public class Aluno extends Pessoa{
	private LocalDate dataMatricula;
    private PlanoEnum plano;
    
	public Aluno(String nome, String cpf, String senha, LocalDate dataMatricula, PlanoEnum plano) {
		super(nome, cpf, senha);
		this.dataMatricula = dataMatricula;
		this.plano = plano;
	}
	// fazer exibirDados ou toString
}

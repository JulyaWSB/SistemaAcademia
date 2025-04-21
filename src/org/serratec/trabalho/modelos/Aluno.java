package org.serratec.trabalho.modelos;

import java.time.LocalDate;


public class Aluno extends Pessoa implements GerarRelatorio{
	private LocalDate dataMatricula;
    private Plano plano;
    private Personal personalContratado;
    
	public Aluno(String nome, String cpf, String senha, LocalDate dataMatricula, Plano plano) {
		super(nome, cpf, senha);
		this.dataMatricula = dataMatricula;
		this.plano = plano;
	}
	
	public Personal getPersonalContratado() {
		return personalContratado;
	}

	public void setPersonalContratado(Personal personalContratado) {
		this.personalContratado = personalContratado;
	}
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("\nCPF: " + cpf);
		System.out.println("\nData de matricula: " + dataMatricula);
		System.out.println("\nPlano: " + plano);
		System.out.println(personalContratado != null? "\nPersonal contratado: " + personalContratado : "");
	}
	@Override
	public void gerar() {
			
	}
}

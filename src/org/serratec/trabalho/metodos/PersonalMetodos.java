package org.serratec.trabalho.metodos;

import java.time.LocalDate;

import org.serratec.trabalho.modelos.Aluno;
import org.serratec.trabalho.modelos.Avaliacao;
import org.serratec.trabalho.modelos.Personal;

public class PersonalMetodos {

	public void visualizarAlunos() {
		if (BancoDeDados.listaAlunos().isEmpty()) {
			System.out.println("Não há alunos cadastrados.");
			return;
		}
		for (int i = 0; i < BancoDeDados.alunos.size(); i++) {
			Aluno al = BancoDeDados.alunos.get(i);
			System.out.println((i + 1) + ". "); al.exibirDados();
		}
	} // esse metodo retorna todos os alunos, tenho que verificar se é só o alunos do personal, caso seja tenho que modificar esse metodo
	
	public void registrarAvaliacao(Aluno aluno, LocalDate data,  Personal personal,  String descricao) {
		Avaliacao novaAvaliacao = new Avaliacao(aluno, data, personal, descricao);
		BancoDeDados.adicionarAvaliacao(novaAvaliacao);
		System.out.println("Avaliação registrada com sucesso!");
	} 

	public void visualizarAvaliacoes() {

	}
}

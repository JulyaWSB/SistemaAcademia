package org.serratec.trabalho.metodos;

import org.serratec.trabalho.modelos.Aluno;
import org.serratec.trabalho.modelos.Avaliacao;


public class AvaliacaoMetodos {

	public static void listarAvaliacoesPorAlunos(Aluno aluno){
		if (BancoDeDados.listaAvaliacoesPorAluno(aluno).isEmpty()) {
			System.out.println("Nenhuma avaliação do(a) aluno(a) " + aluno.getNome() + " registrada.");
		} else {
			System.out.println("---Avaliações de " + aluno.getNome() + "---");
			for (Avaliacao av : BancoDeDados.listaAvaliacoesPorAluno(aluno)) {
				System.out.println("Data: "+ av.getData());
				System.out.println("Personal: " + av.getPersonal());
				System.out.println("Descrição: " + av.getDescricao());
			}
		}
	}

	/*
	listaAvaliacoesPorPeriodo(LocalDate inicio, LocalDate fim)


	listaAvaliacoesPorPersonal(Personal personal)*/

}

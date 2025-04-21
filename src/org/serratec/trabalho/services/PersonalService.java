package org.serratec.trabalho.services;

import org.serratec.trabalho.modelos.Aluno;
import org.serratec.trabalho.modelos.Plano;

public class PersonalService {

	public void visualizarAlunos() {
		if (BancoDeDados.listaAlunos().isEmpty()) {
			System.out.println("Não há alunos cadastrados.");
			return;
		}
		for (int i = 0; i < BancoDeDados.alunos.size(); i++) {
			Aluno al = BancoDeDados.alunos.get(i);
			System.out.println((i + 1) + ". " + al.toString()); // tem que criar toString ou exibirDados no Aluno
		}

	}


	public void registrarAvaliacoes() {

	}

	public void visualizarAvaliacoes() {

	}
}

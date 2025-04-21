package org.serratec.trabalho.metodos;

import org.serratec.trabalho.modelos.Aluno;
import org.serratec.trabalho.modelos.Personal;

public class AlunoMetodos {
	//talvez seja um metodo redundante, depois vemos se mantemos por organização ou não
	public void visualizarDadosPessoais(Aluno aluno) {
		aluno.exibirDados();
	}

	public void contratarPersonal(Aluno aluno, Personal personal) {
		if (aluno.getPersonalContratado() != null) {
			System.out.println("Aluno já possui um personal contratado.");
		} else {
			aluno.setPersonalContratado(personal);
			System.out.println("Personal contratado com sucesso!");
		}}

	//talvez seja um metodo redundante, depois vemos se mantemos por organização ou não
	public void visualizarAvaliacoes(Aluno aluno){
		AvaliacaoMetodos.listarAvaliacoesPorAlunos(aluno);
	}
}

package org.serratec.trabalho.services;

import java.time.LocalDate;

import org.serratec.trabalho.enums.Especialidades;
import org.serratec.trabalho.enums.PlanoEnum;
import org.serratec.trabalho.modelos.Aluno;
import org.serratec.trabalho.modelos.Personal;

public class FuncionarioService {
	public void cadastrarPlano() {

	}

	public void cadastrarAluno(String nome, String cpf, String senha, LocalDate dataMatricula, PlanoEnum plano) {
		if (UsuarioService.cpfExistente(cpf)) {
			System.out.println("Falha no cadastro: CPF já cadastrado."); // trocar por exceções? 
			return;
		}

		Aluno novoAluno = new Aluno(nome, cpf, senha, dataMatricula, plano);
		BancoDeDados.adicionarAluno(novoAluno);
		System.out.println("Aluno cadastrado com sucesso!");
	}

	public void cadastrarPersonal(String nome, String cpf, String senha, String cref, Especialidades especialidade){
		if (UsuarioService.cpfExistente(cpf)) {
			System.out.println("Falha no cadastro: CPF já cadastrado.");// trocar por exceções? 
			return;
		} 
		Personal novoPersonal = new Personal(nome, cpf, senha, cref, especialidade);
		BancoDeDados.adicionarPersonal(novoPersonal);
		System.out.println("Personal cadastrado com sucesso!"); 
	}


}

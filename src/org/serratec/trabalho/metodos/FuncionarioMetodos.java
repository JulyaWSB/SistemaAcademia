package org.serratec.trabalho.metodos;

import java.time.LocalDate;

import org.serratec.trabalho.enums.Especialidades;
import org.serratec.trabalho.enums.PlanoEnum;
import org.serratec.trabalho.modelos.Aluno;
import org.serratec.trabalho.modelos.Personal;
import org.serratec.trabalho.modelos.Plano;

public class FuncionarioMetodos {
	
	
	public static void cadastrarPlanos (PlanoEnum plano, String descricao, double valor) {
		if (PlanoMetodos.planoExistente(plano, descricao, valor)) {
			System.out.println("Falha no cadastro: Plano já cadastrado."); //trocar por exceção
			return;
		}
		Plano novoPlano = new Plano(plano, descricao, valor);
		BancoDeDados.adicionarPlano(novoPlano);
		System.out.println("Plano cadastrado com sucesso!");
	}

	public void cadastrarAluno(String nome, String cpf, String senha, LocalDate dataMatricula, Plano plano) {
		if (UsuarioMetodos.cpfExistente(cpf)) {
			System.out.println("Falha no cadastro: CPF já cadastrado."); // trocar por exceções? 
			return;
		}

		Aluno novoAluno = new Aluno(nome, cpf, senha, dataMatricula, plano);
		BancoDeDados.adicionarAluno(novoAluno);
		System.out.println("Aluno cadastrado com sucesso!");
	}

	public void cadastrarPersonal(String nome, String cpf, String senha, String cref, Especialidades especialidade){
		if (UsuarioMetodos.cpfExistente(cpf)) {
			System.out.println("Falha no cadastro: CPF já cadastrado.");// trocar por exceções? 
			return;
		} 
		Personal novoPersonal = new Personal(nome, cpf, senha, cref, especialidade);
		BancoDeDados.adicionarPersonal(novoPersonal);
		System.out.println("Personal cadastrado com sucesso!"); 
	}
	
	public void emitirRelatorios() {}
}

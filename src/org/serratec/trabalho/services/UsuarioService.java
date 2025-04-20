package org.serratec.trabalho.services;

import java.time.LocalDate;

import org.serratec.trabalho.modelos.Aluno;
import org.serratec.trabalho.modelos.Especialidades;
import org.serratec.trabalho.modelos.Funcionario;
import org.serratec.trabalho.modelos.Personal;
import org.serratec.trabalho.modelos.Pessoa;
import org.serratec.trabalho.modelos.Plano;

public class UsuarioService {

	public boolean cpfExistente(String cpf) {
		for (Pessoa p : BancoDeDados.listarTodasAsPessoas()) {
			if (p.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}

	public Pessoa validarLogin(String cpf, String senha) {
		for(Pessoa p : BancoDeDados.listarTodasAsPessoas()){
			if ( p.getCpf().equals(cpf) && p.getSenha().equals(senha)) {
				return p;
			}
		}	return null; // adicionar nova exceção de login invalido?
	}

	public String identificarTipoPessoa(Pessoa pessoa) {
		if (pessoa instanceof Aluno) {
			return "Aluno";
		} else if (pessoa instanceof Personal) {
			return "Personal";
		}else if (pessoa instanceof Funcionario) {
			return "Funcionario";
		}
		return "Desconhecido";
	};


	public void cadastrarAluno(String nome, String cpf, String senha, LocalDate dataMatricula, Plano plano) {
		if (cpfExistente(cpf)) {
			System.out.println("Falha no cadastro: CPF já cadastrado."); // trocar por exceções? 
			return;
		}

		Aluno novoAluno = new Aluno(nome, cpf, senha, dataMatricula, plano);
		BancoDeDados.adicionarAluno(novoAluno);
		System.out.println("Aluno cadastrado com sucesso!");
	}

	public void cadastrarPersonal(String nome, String cpf, String senha, String cref, Especialidades especialidade){
		if (cpfExistente(cpf)) {
			System.out.println("Falha no cadastro: CPF já cadastrado.");// trocar por exceções? 
			return;
		} 
		Personal novoPersonal = new Personal(nome, cpf, senha, cref, especialidade);
		BancoDeDados.adicionarPersonal(novoPersonal);
		System.out.println("Personal cadastrado com sucesso!"); 
	}

	public void cadastrarFuncionario(String nome, String cpf, String senha, String cargo){ //se tiver cadastro de funcionario
		if (cpfExistente(cpf)) {
			System.out.println("Falha no cadastro: CPF já cadastrado."); // trocar por exceções? 
			return;
		} 
		Funcionario novoFuncionario = new Funcionario( nome, cpf, senha, cargo);
		BancoDeDados.adicionarFuncionario(novoFuncionario);
		System.out.println("Funcionario cadastrado com sucesso!");}


}

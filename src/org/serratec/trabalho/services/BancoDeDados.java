package org.serratec.trabalho.services;

import java.util.ArrayList;
import java.util.List;

import org.serratec.trabalho.modelos.Aluno;
import org.serratec.trabalho.modelos.Funcionario;
import org.serratec.trabalho.modelos.Personal;
import org.serratec.trabalho.modelos.Pessoa;
import org.serratec.trabalho.modelos.Plano;

public class BancoDeDados {

	static List<Aluno> alunos = new ArrayList<>();
	static List<Personal> personals = new ArrayList<>();
	static List<Funcionario> funcionarios = new ArrayList<>();
	//List<Plano> planos = new ArrayList<>();
	//List<Avaliacao> avaliacoes = new ArrayLis<>();
	
	public static void adicionarAluno(Aluno aluno){
		alunos.add(aluno);
	}
	
	public static void adicionarPersonal(Personal personal) {
		personals.add(personal);
	}
	
	public static void adicionarFuncionario(Funcionario funcionario){ //vai ter opção adicionar funcionarios?
		funcionarios.add(funcionario);
	}
	
	public List<Aluno> listarAlunos() {
		return alunos;
	} 

	public List<Personal> listarPersonals() {
		return personals;
	} 

	public List<Funcionario> listarFuncionarios() {
		return funcionarios;
	} 
	
	

	public static List<Pessoa> listarTodasAsPessoas() {
		List<Pessoa> todos = new ArrayList<>();
		todos.addAll(alunos);
		todos.addAll(personals);
		todos.addAll(funcionarios);
		return todos;
	}


	public static Pessoa buscarPessoaPorCpf(String cpf){
		for (Pessoa p : listarTodasAsPessoas()) {
			if (p.getCpf().equals(cpf)) {
				return p;
			}
		} return null; //substituir por exceção: UsuarioNaoEncontradoException(); 
	}}





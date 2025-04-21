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
	static List<Plano> planos = new ArrayList<>();
	//List<Avaliacao> avaliacoes = new ArrayList<>();

	public static void adicionarAluno(Aluno aluno){
		alunos.add(aluno);
	}

	public static void adicionarPersonal(Personal personal) {
		personals.add(personal);
	}

	public static void adicionarFuncionario(Funcionario funcionario){ 
		funcionarios.add(funcionario);
	}

	public static void adicionarPlano(Plano plano) {
		planos.add(plano);
	}


	public static List<Aluno> listaAlunos() {
		return alunos;
	} 

	public static List<Personal> listaPersonals() {
		return personals;
	} 

	public static List<Funcionario> listaFuncionarios() {
		return funcionarios;
	} 

	public static List<Plano> listaPlanos(){
		return planos;
	}



	public static List<Pessoa> listaTodasAsPessoas() {
		List<Pessoa> todos = new ArrayList<>();
		todos.addAll(alunos);
		todos.addAll(personals);
		todos.addAll(funcionarios);
		return todos;
	}


	public static Pessoa buscarPessoaPorCpf(String cpf){
		for (Pessoa p : listaTodasAsPessoas()) {
			if (p.getCpf().equals(cpf)) {
				return p;
			}
		} return null; //substituir por exceção: UsuarioNaoEncontradoException(); 
	}}





package org.serratec.trabalho.modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Aluno extends Pessoa implements GerarRelatorio {
    private LocalDate dataMatricula;
    private Plano plano;
    private Personal personalContratado;
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    public Aluno(String nome, String cpf, String senha, LocalDate dataMatricula, Plano plano) {
        super(nome, cpf, senha);
        this.dataMatricula = dataMatricula;
        this.plano = plano;
    }

    public void contratarPersonal(Personal personal) {
        this.personalContratado = personal;
        if (!personal.getAlunos().contains(this)) {
            personal.getAlunos().add(this);
        }
    }
    public void removerPersonal() {
        this.personalContratado = null;
    }

    public boolean possuiPersonal() {
        return personalContratado != null;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public Plano getPlano() {
        return plano;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public Personal getPersonalContratado() {
        return personalContratado;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }


	@Override
	public void gerar() {
		//método obrigatório
		
	}
}
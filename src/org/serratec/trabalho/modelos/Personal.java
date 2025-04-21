package org.serratec.trabalho.modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Personal extends Pessoa {
    private String cref;
    private Especialidades especialidade;
    private List<Aluno> alunos = new ArrayList<>();

    public Personal(String nome, String cpf, String senha, String cref, Especialidades especialidade) {
        super(nome, cpf, senha);
        this.cref = cref;
        this.especialidade = especialidade;
    }

    public void registrarAvaliacao(Aluno aluno, String descricao) {
        Avaliacao avaliacao = new Avaliacao(aluno, LocalDate.now(), this, descricao);
        aluno.adicionarAvaliacao(avaliacao);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getCref() {
        return cref;
    }

    public Especialidades getEspecialidade() {
        return especialidade;
    }
}


package org.serratec.trabalho.modelos;

import java.time.LocalDate;

public class Avaliacao {
    private Aluno aluno;
    private LocalDate data;
    private Personal personal;
    private String descricao;

    public Avaliacao(Aluno aluno, LocalDate data, Personal personal, String descricao) {
        this.aluno = aluno;
        this.data = data;
        this.personal = personal;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Personal getPersonal() {
        return personal;
    }
}


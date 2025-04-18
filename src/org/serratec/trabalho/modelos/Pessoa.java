package org.serratec.trabalho.modelos;

public class Pessoa {
	protected String nome;
    protected String cpf;
    protected String senha;

    public Pessoa(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }
}

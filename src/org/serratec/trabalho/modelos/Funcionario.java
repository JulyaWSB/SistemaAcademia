package org.serratec.trabalho.modelos;

public class Funcionario extends Pessoa{
	private CargoFuncionario cargo;

    public Funcionario(String nome, String cpf, String senha, CargoFuncionario cargo) {
        super(nome, cpf, senha);
        this.cargo = cargo;
    }

    public CargoFuncionario getCargo() {
        return cargo;
    }
}

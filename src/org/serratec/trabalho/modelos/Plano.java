package org.serratec.trabalho.modelos;

public enum Plano {
	MENSAL_1_MODALIDADE("Mensal - 01 modalidade", 80.0),
    MENSAL_2_MODALIDADES("Mensal - 02 modalidades", 130.0),
    MENSAL_TOTAL("Mensal - musculação + funcional + coletivas", 190.0),
    TRIMESTRAL_TOTAL("Trimestral - todas as modalidades", 500.0),
    SEMESTRAL_TOTAL("Semestral - todas as modalidades", 950.0),
    ANUAL_TOTAL("Anual - todas as modalidades", 1800.0);

    private final String descricao;
    private final double valor;

    Plano(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("%s - R$ %.2f", descricao, valor);
    }
}

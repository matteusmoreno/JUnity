package domain;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;
    private Desempenho desempenho;
    private BigDecimal salario;

    public Funcionario(String nome, Desempenho desempenho, BigDecimal salario) {
        this.nome = nome;
        this.desempenho = desempenho;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Desempenho getDesempenho() {
        return desempenho;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}

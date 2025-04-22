package entities;

import java.util.Objects;

public class Conta {
    private static int ultimoNumero = 0;

    private String nome;
    private Integer numeroConta;
    private Double saldo;

    public Conta(){}

    public Conta(String nome) {
        this.nome = nome;
        this.numeroConta = ultimoNumero++;
        this.saldo = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Conta conta)) return false;
        return Objects.equals(numeroConta, conta.numeroConta);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroConta);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}

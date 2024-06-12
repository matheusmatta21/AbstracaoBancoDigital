package org.bancodigital.model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente, String agencia, String numeroConta) {
        super(cliente, agencia, numeroConta);
    }

    @Override
    public String toString() { //colocar metodo mais elaborado para print
        return "ContaPoupanca{" +
                "cliente=" + cliente +
                ", agencia='" + agencia + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

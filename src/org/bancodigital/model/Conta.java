package org.bancodigital.model;

public abstract class Conta implements ContaInterface {

    protected Cliente cliente;
    protected String agencia;
    protected String numeroConta;
    protected double saldo;

    public Conta(Cliente cliente, String agencia, String numeroConta) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double saque) {
        this.saldo -= saque;
    }
}

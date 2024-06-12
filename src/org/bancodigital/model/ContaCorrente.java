package org.bancodigital.model;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {
    protected List<Transacao> extrato;

    public ContaCorrente(Cliente cliente, String agencia, String numeroConta) {
        super(cliente, agencia, numeroConta);
        this.extrato = new ArrayList<>();
    }

    public List<Transacao> getExtrato() {
        return extrato;
    }

    public void adicionarTransacao(Transacao transacao) {
        extrato.add(transacao);
    }
    public void imprimirExtrato(){
        System.out.println(this.extrato);
    }

    @Override
    public String toString() { //colocar metodo mais elaborado para print
        return "ContaCorrente{" +
                "cliente=" + cliente +
                ", agencia='" + agencia + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

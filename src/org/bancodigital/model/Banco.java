package org.bancodigital.model;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private final String nome;
    private final Set<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public Set<Conta> getContas() {
        return contas;
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public void saudacao() {
        System.out.println("Bem vindo ao banco " + this.nome + "!");
    }
    public void imprimirContas(){
        System.out.println(this.contas);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "contas=" + contas +
                '}';
    }
}

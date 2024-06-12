package org.bancodigital.model;

public class Transacao {
    private final String tipoTransacao;
    private final double valorTransacao;
//    data
//    hora

    public Transacao(String tipoTransacao, double valorTransacao) {
        this.tipoTransacao = tipoTransacao;
        this.valorTransacao = valorTransacao;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "tipoTransacao='" + tipoTransacao + '\'' +
                ", valorTransacao=" + valorTransacao +
                '}';
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }
}

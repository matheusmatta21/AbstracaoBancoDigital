package org.bancodigital.model;

public class Cliente {
    private final String nomeUsuario;
    private final String senha;
    private int telefone;
    private final String email;
    private final String cpf;
    private String endereco;

    public Cliente(String nomeUsuario, String senha, String cpf, String email) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.cpf = cpf;
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", senha=" + senha +
                ", telefone=" + telefone +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}

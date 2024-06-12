package org.bancodigital.service;

import org.bancodigital.model.Cliente;

import java.util.Scanner;

public class ClienteService {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        criarCliente();
    }

    public static Cliente criarCliente() {
        {
            System.out.println("Digite seu nome de usuário:");
            String nome = scanner.nextLine();
            String senha = criarSenha();
            if (!senha.isEmpty()) {
                System.out.println("Digite seu CPF:");
                String cpf = scanner.nextLine();
                System.out.println("Digite seu e-mail: ");
                String email = scanner.nextLine();
                return new Cliente(nome, senha, cpf, email);
            } else {
                System.out.println("As senhas não coincidem.");
                return null;
            }
        }
    }

    public static String criarSenha() {
        {
            System.out.println("Digite sua senha: ");
            String senha = scanner.nextLine();
            if (!confirmarSenha(senha)) {
                return "";
            }
            return senha;
        }

    }

    public static boolean confirmarSenha(String senha) {
        {
            System.out.println("Confirme sua senha: ");
            String senhaConfirmada = scanner.nextLine();
            return senha.equals(senhaConfirmada);
        }

    }
}

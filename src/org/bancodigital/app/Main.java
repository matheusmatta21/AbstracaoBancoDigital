package org.bancodigital.app;//“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança),
//as quais possuem as funcionalidades de depósito, saque e transferência
//(entre contas da própria instituição)."


import org.bancodigital.model.*;
import org.bancodigital.util.MenuUtil;

import java.util.Scanner;

import static org.bancodigital.service.ClienteService.criarCliente;
import static org.bancodigital.service.ContaService.criarConta;
import static org.bancodigital.service.ContaService.verificarSaldoParaSaque;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Banco bancoBradesco = new Banco("Bradesco");
            ContaCorrente contaAtual = null;

            bancoBradesco.saudacao();
            while (true) {
                MenuUtil.menu();
                int opcao = scanner.nextInt();
                if (opcao == 7) {
                    break;
                }
                switch (opcao) {
                    case 1: {
                        ContaCorrente novaConta = criarConta(criarCliente());
                        bancoBradesco.addConta(novaConta);
                        contaAtual = novaConta;
                    }
                    break;
                    case 2:
                        if (contaAtual != null) {
                            System.out.println(contaAtual.getSaldo());
                        }
                        break;
                    case 3:
                        if (contaAtual != null) {
                            double valor = scanner.nextDouble();
                            contaAtual.depositar(valor);
                            contaAtual.adicionarTransacao(new Transacao("Deposito", valor));
                        }
                        break;
                    case 4:
                        if (contaAtual != null) {
                            double valor = scanner.nextDouble();
                            if (verificarSaldoParaSaque(contaAtual.getSaldo(), valor)) {
                                contaAtual.sacar(valor);
                                contaAtual.adicionarTransacao(new Transacao("Saque", valor));
                            } else {
                                System.out.println("O saque não pode ser efetuado.");
                            }
                        }
                        break;
                    case 5:
                        if (contaAtual != null && !contaAtual.getExtrato().isEmpty()) {
                            contaAtual.imprimirExtrato();
                        }
                        break;
                    case 6:
                        if (!bancoBradesco.getContas().isEmpty()) {
                            bancoBradesco.imprimirContas();
                        }
                }
            }

        }
    }
}
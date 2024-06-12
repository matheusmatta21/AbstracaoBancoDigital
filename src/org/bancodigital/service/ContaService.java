package org.bancodigital.service;

import org.bancodigital.model.Cliente;
import org.bancodigital.model.ContaCorrente;

import java.util.Scanner;

import static org.bancodigital.service.ClienteService.criarCliente;

public class ContaService {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        criarConta(criarCliente());
    }

    public static ContaCorrente criarConta(Cliente cliente) {
        {
            System.out.println("Digite a agência: ");
            String agencia = scanner.nextLine();
            System.out.println("Digite o numero da conta:");
            String numeroConta = scanner.nextLine();
            return new ContaCorrente(cliente, agencia, numeroConta);
        }


    }

    public static boolean verificarSaldoParaSaque(double saldo, double valor) {
        return saldo > valor;
    }
}

package com.banco;

import java.util.Scanner;

public class GerenciadorBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        Usuario usuario = new Usuario(nome, sobrenome, cpf);
        ContaBancaria conta = new ContaBancaria(usuario);

        int opcao;
        do {
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: " + conta.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Valor do depósito: ");
                    conta.depositar(scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Valor do saque: ");
                    if (conta.sacar(scanner.nextDouble())) {
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar nosso sistema!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
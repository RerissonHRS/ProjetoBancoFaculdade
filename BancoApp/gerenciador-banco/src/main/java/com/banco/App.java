// Usuario.java
package com.banco;

public class Usuario {
    private String nome;
    private String sobrenome;
    private String cpf;

    // Getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
}

// ContaBancaria.java
package com.banco;

public class ContaBancaria {
    private Usuario usuario;
    private double saldo;

    public ContaBancaria(Usuario usuario) {
        this.usuario = usuario;
        this.saldo = 0.0;
    }

    public double consultarSaldo() { return saldo; }

    public void depositar(double valor) { saldo += valor; }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}

// GerenciadorBanco.java
package com.banco;

import java.util.Scanner;

public class GerenciadorBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Usuario usuario = new Usuario();
        System.out.print("Nome: ");
        usuario.setNome(scanner.nextLine());
        System.out.print("Sobrenome: ");
        usuario.setSobrenome(scanner.nextLine());
        System.out.print("CPF: ");
        usuario.setCpf(scanner.nextLine());

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
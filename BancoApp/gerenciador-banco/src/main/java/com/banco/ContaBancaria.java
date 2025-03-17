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

    public Usuario getUsuario(){
        return usuario;
    }
}
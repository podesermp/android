package com.ufc.ec.mainactivity;

public class Conta {

    protected int numeroConta;
    private double saldo = 100;


    public double recuperarSaldo(){
        return this.saldo;
    }


    public void depositar(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }

    public void sacar(double valorSaque){
        this.saldo = this.saldo - valorSaque;
    }

}

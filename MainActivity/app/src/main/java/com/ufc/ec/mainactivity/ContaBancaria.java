package com.ufc.ec.mainactivity;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    //Contrutor

    ContaBancaria(){
        System.out.println("Construtor chamado");

    }

    ContaBancaria(int nConta){
        System.out.println("Construtor chamado  " + nConta);
    }

}

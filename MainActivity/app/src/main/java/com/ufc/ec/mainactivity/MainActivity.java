package com.ufc.ec.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ContaBancaria conta = new ContaBancaria(972642023);
























//        Conta conta = new Conta();
//        conta.depositar(100);
//        System.out.println(conta.recuperarSaldo());
//        conta.sacar(50);
//        System.out.println(conta.recuperarSaldo());

























//        Animal animal = new Animal();
//        Cao cao = new Cao();
//        Passaro passaro = new Passaro();
//
////        cao.setCor("Amarelo");
////        System.out.println( cao.getCor() );
//
//        passaro.correr();
//        cao.correr();

        /*
        Casa minhaCasa = new Casa();
        minhaCasa.cor = "preto";

        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();
         */
        /*
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Marcos Paulo";
        funcionario.salario = 20000;
        double salarioRecuperado = funcionario.recuperarSalario();
        System.out.println("O salário do " + funcionario.nome + " é:" + salarioRecuperado);
         */

    }
}

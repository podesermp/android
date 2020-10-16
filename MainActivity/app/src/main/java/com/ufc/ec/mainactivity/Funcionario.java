package com.ufc.ec.mainactivity;

class Funcionario {

    //Propriedades
    String nome;
    double salario;


    //Metodos
    double recuperarSalario(){
        this.salario = this.salario -(this.salario * 0.1);
        return this.salario;
        //System.out.println(this.salario);
    }

}

package com.ufc.ec.mainactivity;

class Animal {

    int tamanho = 0;
    String cor = " ";
    double peso = 0;


    //Set é usado para configurar;
    //Get é usado para recuperar;


    void setCor(String cor){

        if(cor == "Azul"){
            this.cor = cor;
        }else {
            System.out.println("Cor indisponível");
        }

    }

    String getCor(){
        return this.cor;
    }


    void dormir(){
        System.out.println("Dormir como um animal");
    }

    void correr(){
        System.out.println("Correr como um");
    }

}

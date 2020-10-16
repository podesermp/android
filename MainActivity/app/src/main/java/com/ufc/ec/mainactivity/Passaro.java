package com.ufc.ec.mainactivity;

class Passaro extends Animal{

    void voar(){
        System.out.println("Voar como um pássaro");
    }

    void correr(){
        super.correr();
        System.out.println("pássaro");
    }

}

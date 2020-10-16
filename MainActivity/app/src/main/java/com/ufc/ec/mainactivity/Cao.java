package com.ufc.ec.mainactivity;

class Cao extends Animal{

    void latir(){
        System.out.println("Latir como um cachorro");
    }

    void correr(){

        super.correr();
        System.out.println("cao");
    }
}

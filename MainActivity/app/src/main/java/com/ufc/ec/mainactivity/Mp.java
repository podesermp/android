package com.ufc.ec.mainactivity;

public class Mp extends Cidadao implements Presidente{


    @Override
    public void ganharEleicao() {
        System.out.println("Ganhou a eleição no EUA");
    }
}

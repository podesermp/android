package com.ufc.ec.recyclerview.activity.model;

public class Bairro {

    private String nomeBairro, id, populacao;

    public Bairro(){

    }

    public Bairro(String nomeBairro, String id, String populacao) {
        this.nomeBairro = nomeBairro;
        this.id = id;
        this.populacao = populacao;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }
}

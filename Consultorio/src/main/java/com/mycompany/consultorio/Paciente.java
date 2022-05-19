package com.mycompany.consultorio;

public class Paciente {
    String nome;
    /*String senha;*/
    /*int posicao;*/


    public Paciente(String nome) {
        this.nome = nome;
        /*this.senha = senha;*/
        /*this.posicao = posicao*/
    }

    @Override
    public String toString() {
        return nome;
    }

    public void atualizaPosicao() {

    }
}

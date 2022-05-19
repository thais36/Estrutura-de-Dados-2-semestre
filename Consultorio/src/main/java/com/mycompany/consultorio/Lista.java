package com.mycompany.consultorio;

public class Lista  <T> extends EstruturaEstatica<T>{
    //método construtor com parâmetros o super porque está herdando...
    public Lista(int capacidade) {
        super(capacidade);
    }
    //método construtor sem Parâmetros
    public Lista() {
        super();
    }
    
    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }
    
    public boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao, elemento);
    }
}
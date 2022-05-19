package com.mycompany.estruturaestatica;

public class Teste3 {
    //verificar o elemento do topo
    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        System.out.println(pilha.topo());
        
        System.out.println(pilha);
        
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        
        System.out.println(pilha.topo());
        
        System.out.println(pilha);
    }
}
package com.mycompany.estruturaestatica;

public class Teste4 {
    //desempilhar a pilha(LIFO)
    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        System.out.println(pilha.topo());
        
        System.out.println(pilha);
        
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        
        System.out.println(pilha);
        
        System.out.println("Desempilhar elemento " +pilha.desempilha());
        
        System.out.println(pilha);
    }
}
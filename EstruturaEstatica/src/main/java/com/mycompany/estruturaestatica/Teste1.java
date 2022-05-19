package com.mycompany.estruturaestatica;

public class Teste1 {
    //Verificar o comportamneto LIFO - Last In First Out (Último a entrar, primeiro a sair)
    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        for (int i=1; i<=10; i++){
            pilha.empilha(i);
        }
        
        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
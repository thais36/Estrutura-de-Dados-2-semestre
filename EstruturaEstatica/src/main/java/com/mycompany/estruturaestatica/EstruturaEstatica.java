package com.mycompany.estruturaestatica;

public class EstruturaEstatica<T> {
    public T[] elementos;
    public int tamanho;
    //método construtor com parâmetro
    public EstruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    //método construtor sem parâmetro
    public EstruturaEstatica(){
        this(10);
    }
    //método para adicionar elemento
    public boolean adiciona (T elemento){
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    //método para adicionar em qualquer posição
    public boolean adiciona(int posição, T elemento){
       if(!(posicao >=0 && posicao <tamanho)){
           throw new IllegalArgumentException("Posição Inválida");    
       } 
       this.aumentaCapacidade();
    for(int i=this.tamanho-1; i>=posição; i--){
        this.elementos[i+1] = this.elementos[i];
    }
    this.elementos[posicao] = elemento;
    this.tamanho++;
    
    return true;
}    
    //método para aumentar a capacidade do vetor
    public void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length];
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    public int tamanho(){
        return this.tamanho;
    }
        
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for(int i=0; i<this.tamanho-1; i++){
        s.append(this.elementos[i]);
        s.append(", ");
    }

        if(this.tamanho> 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");
        
        return s.toString();
    }

        public boolean estaVazia(){
        return this.tamanho == 0;
    }

    public void remove(int posicao){
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        for (int i=posicao; i<tamanho-1; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho --;    
    }
}        
    
    
    

package com.mycompany.consultorio;

import javax.swing.JOptionPane;

public class Fila<T> {
    //atributos
    public T[] elemento;
    public int tamanho;

    //construtor
    public Fila(int capacidade) {
        this.elemento = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    //Métodos
    public void tamanho() {
        JOptionPane.showMessageDialog(null,
                "A fila de espera tem um total de: " + this.tamanho + " pacientes");
    }

    public void aumentaCapacidadeFila() {
        if (this.tamanho == this.elemento.length) {
            T[] elementosNovos = (T[]) new Object[this.elemento.length * 2];
            for (int i = 0; i < this.elemento.length; i++) {
                elementosNovos[i] = this.elemento[i];
            }
            this.elemento = elementosNovos;
        }
    }

    public boolean adicionaElemento(T elemento) {
        this.aumentaCapacidadeFila();
        if (this.tamanho < this.elemento.length) {
            this.elemento[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public T removePacienteDaFila() {
        int posicao = 0;
        T elementoASerRemovido = this.elemento[0];

        if (this.tamanho == 0) {
            return null;
        }

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            elemento[i] = elemento[i + 1];
        }

        tamanho--;

        return elementoASerRemovido;
    }


    public void FilaCheiaOuVazia() {
        if (this.tamanho == 0) {
            JOptionPane.showMessageDialog(null, "A fila está vazia");
        } else if (this.tamanho > 0) {
            JOptionPane.showMessageDialog(null, "A fila não está vazia");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elemento[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elemento[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    public void exibeFila() {
        JOptionPane.showMessageDialog(null, "Pacientes aguardando atendimento \n\n" + this.toString());
    }

    public T proximoPaciente() {
        if (tamanho == 0) {
            return null;
        } else return this.elemento[0];
    }

    public void exibeProximoPaciente() {
        JOptionPane.showMessageDialog(null, "O próximo paciente a ser atendidao é: \n\n" + proximoPaciente());
    }
    /*
    public int buscaPorConteudo (String ConteudoDoelemento) {
        for (int i=0; i<tamanhoDoVetor; i++) {
            if(elementosDoVetor[i].equals(ConteudoDoelemento)) {
                return i;
            }
        }
        return -1;
    }
     */
}
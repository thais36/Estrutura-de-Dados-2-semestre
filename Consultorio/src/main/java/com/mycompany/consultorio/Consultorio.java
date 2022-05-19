package com.mycompany.consultorio;

import javax.swing.*;

public class Consultorio {

    public static void main(String[] args) {
        Fila<Object> consultorio = new Fila(50);
        Paciente p01 = new Paciente("Thais");
        Paciente p02 = new Paciente("João");
        Paciente p03 = new Paciente("Maria");
        Paciente p04 = new Paciente("Vanessa");
        Paciente p05 = new Paciente("Pedro");

        consultorio.adicionaElemento(p01);
        consultorio.adicionaElemento(p02);
        consultorio.adicionaElemento(p03);
        consultorio.adicionaElemento(p04);
        consultorio.adicionaElemento(p05);


        consultorio.exibeFila();
        consultorio.exibeProximoPaciente();
        consultorio.FilaCheiaOuVazia();
        consultorio.tamanho();

    JOptionPane.showMessageDialog(null, consultorio.removePacienteDaFila());
     consultorio.exibeFila();

        /*
        JOptionPane.showMessageDialog(null, consultorioZL.removePacienteDaFila());
        consultorioZL.exibeFila();

        String Menu =
                "*****************************************************************************\n" +
                "\n" +
                "                              *** MENU DE OPÇÕES ***\n" +
                "\n" +
                "** 1 – Inserir Pacientes\n" +
                "\n" +
                "** 2 – Chamar o paciente para ser atendido\n" +
                "\n" +
                "** 3 – Visualizar Fila (cheia ou vazia)?\n" +
                "\n" +
                "** 4 – Próximo Paciente a ser atendido\n" +
                "\n" +
                "** 5 – Quantidade de Pacientes na fila\n" +
                "\n" +        "** 6 – Sair"  +
                "\n*****************************************************************************\n";

        JOptionPane.showMessageDialog(null, "*");
*/
    }
}

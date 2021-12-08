package br.com.elder;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        ArrayList<Animal> animais = new ArrayList<>();

//        Funcionario funcionario = new Funcionario();
//        funcionario.setNome("Elder");
//        Gerente gerente = new Gerente();
//        gerente.setNome("Vinicius");
//
//        System.out.println(funcionario.getNome());
//        System.out.println(gerente.getNome());

//        JOptionPane.showMessageDialog(null, "Nome do Gerente é => " + gerente.getNome());

//        Cachorro cachorro = new Cachorro();
//        cachorro.setNome("Bob");
//        cachorro.late();
//
//        Gato gato = new Gato();
//        gato.setRaca("Siames");
//        gato.mia();
//
//        animais.add(gato);
//        animais.add(cachorro);

//        ContaCorrente contaNormal = new ContaCorrente();
//        contaNormal.setIdConta(1);
//        contaNormal.saque(200.0);
//
//        ContaCorrenteVip contaVip = new ContaCorrenteVip();
//        contaVip.setIdConta(2);
//        contaVip.saque(1000.0);
//
//        JOptionPane.showMessageDialog(null, "Conta Normal => " + contaNormal.getSaldoConta());
//        JOptionPane.showMessageDialog(null, "Conta Vip    => " + contaVip.getSaldoConta());
//


        Computador pc1 = new Computador(1, "PCYES", "Intel", "HD 240GB", "8GB", "Core i5", 5666.90);

        pc1.getPerifericos().add("mouse");

        System.out.println(pc1.getPerifericos());

        Notebook note1 = new Notebook(2, "Dell", "Inspiron", "HD 240GB", "8GB", "Core i5", 9000.00);



    }
}

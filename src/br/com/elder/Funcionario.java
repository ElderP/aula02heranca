package br.com.elder;

import javax.swing.*;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
//        JOptionPane.showMessageDialog(null, "Nome do Funcionário é => " + this.nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

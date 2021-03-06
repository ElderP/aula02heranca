package br.com.elder;

import java.util.ArrayList;

public class Computador {

    private int idComputador;
    private String nome;
    private String modelo;
    private String hd;
    private String memoria;
    private String processador;
    private double preco;
    private ArrayList<String> perifericos = new ArrayList<>();

    public int getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public ArrayList<String> getPerifericos() {
        return perifericos;
    }

    public Computador(int idComputador, String nome, String modelo, String hd, String memoria, String processador,
                        double preco) {
        this.idComputador = idComputador;
        this.nome = nome;
        this.modelo = modelo;
        this.hd = hd;
        this.memoria = memoria;
        this.processador = processador;
        this.preco = preco;
    }


}

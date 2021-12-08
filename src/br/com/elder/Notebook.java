package br.com.elder;

public class Notebook extends Computador{

    private String bateria;
    private String tela;
    private String teclado;

    public Notebook(int idComputador, String nome, String modelo, String hd, String memoria, String processador,
                    double preco) {
        super(idComputador, nome, modelo, hd, memoria, processador, preco);
    }


}

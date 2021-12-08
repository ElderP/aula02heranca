package br.com.elder;

public class ContaCorrente {

    private int idConta;
    private double saldoConta;
    //taxa saque é regra de negócio
    private final double taxaSaque = 5.50;

    public void saque(Double valor){
        if (valor > 0){
            saldoConta = saldoConta - valor - getTaxaSaque();
        }
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public double getTaxaSaque() {
        return taxaSaque;
    }
}
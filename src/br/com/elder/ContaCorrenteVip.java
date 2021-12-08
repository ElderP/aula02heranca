package br.com.elder;

public class ContaCorrenteVip extends ContaCorrente{

    //taxa saque é regra de negócio
    private final double taxaSaque = 1.50;

    @Override
    public double getTaxaSaque() {
        return taxaSaque;
    }

}

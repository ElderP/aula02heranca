package br.com.elder;

import javax.swing.*;

public class Gerente extends Funcionario{

    private int senha;

    @Override
    public void setNome(String nome) {
        if (nome != null && !nome.equals("")){
            super.setNome(nome);
//            JOptionPane.showMessageDialog(null, "Nome do Gerente é => " + nome);
        }else {
//            JOptionPane.showMessageDialog(null, "Nome do Gerente não pode ser nulo");
        }

    }

    public String autentica(int senha){
        String resposta = "não autenticada";

        if ( senha == 1234 ){
            resposta = "autenticado";
        }

        return resposta;
    }

}

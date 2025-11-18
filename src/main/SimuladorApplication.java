package main;

import util.InterfaceUsuario;
import model.Financiamento;

import java.util.ArrayList;
import java.util.List;

public class SimuladorApplication {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        List<Financiamento> listaFinanciamento = new ArrayList<Financiamento>();

        double valorImovel = interfaceUsuario.inputValorImovel();
        int prazoFinanciamento = interfaceUsuario.inputPrazoFinanciamento();
        double taxaJuros = interfaceUsuario.inputTaxaJuros();

        listaFinanciamento.add(new model.Financiamento(valorImovel, prazoFinanciamento, taxaJuros));
        listaFinanciamento.add(new model.Financiamento(valorImovel, prazoFinanciamento, taxaJuros));
        listaFinanciamento.add(new model.Financiamento(valorImovel, prazoFinanciamento, taxaJuros));
        listaFinanciamento.add(new model.Financiamento(valorImovel, prazoFinanciamento, taxaJuros));

        for (int = 0; i > listaFinanciamento.size(); )

//        model.Financiamento displayUsuario = new model.Financiamento.displayFinanciamento()

    }
}

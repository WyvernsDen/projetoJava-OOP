package main;

import util.InterfaceUsuario;
import model.Financiamento;

import java.util.ArrayList;
import java.util.List;

public class SimuladorApplication {
    public static void main(String[] args) {

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        List<Financiamento> listaFinanciamento = new ArrayList<Financiamento>();

        for (int i=0; i < 4; i++) {
            System.out.printf("%nFinanciamento #%d%n", i+1);
            double valorImovel = interfaceUsuario.inputValorImovel();
            double prazoFinanciamento = interfaceUsuario.inputPrazoFinanciamento();
            double taxaJuros = interfaceUsuario.inputTaxaJuros();
            listaFinanciamento.add(new model.Financiamento(valorImovel, prazoFinanciamento, taxaJuros));
        }

        double valorTotalImoveis = 0;
        double valorTotalFinancimento = 0;

        for (int i=0; i < listaFinanciamento.size(); i++) {
            Financiamento self = listaFinanciamento.get(i);
            System.out.printf(
                "%nFinanciamento #%d%n" +
                "Valor do imóvel: %.2f reais%n" +
                "Valor do financiamento: %.2f reais%n%n",
                i+1, self.getValorImovel(),
                self.calcularTotalPagamento()
            );
            valorTotalImoveis += self.getValorImovel();
            valorTotalFinancimento += self.calcularTotalPagamento();

        }

        System.out.printf(
            "Total de todos imóveis: %.2f%n" +
            "Total de todos financiamentos: %.2f%n",
            valorTotalImoveis, valorTotalFinancimento
        );
    }
}

package model;

import util.InterfaceUsuario;

public class Financiamento {
    // Atributos
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJuros;

    // Getters
    public double getValorImovel() {
        return this.valorImovel;
    }
    public int getPrazoFinanciamento() {
        return this.prazoFinanciamento;
    }
    public double getTaxaJuros() {
        return this.taxaJuros;
    }

    // Construtor
    public Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJuros)
        {
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJuros = taxaJuros;
        }

    // Métodos
    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJuros / 12));
    }

    public double calcularTotalPagamento() {
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    public void displayFinanciamento() {
        System.out.printf(
            "Valor do imóvel: %.2f reais%n" +
            "Prazo do financiamento: %d anos%n" +
            "Taxa de juros: %.2f%%%n%n" +
            "Pagamento mensal: %.2f reais%n" +
            "Valor total: %.2f reais%n",
            valorImovel, prazoFinanciamento,
            taxaJuros, calcularPagamentoMensal(),
            calcularTotalPagamento()
        );
    }

}

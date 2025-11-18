package model;

import util.InterfaceUsuario;

public class Financiamento {
    // Atributos
    private double valorImovel;
    private double prazoFinanciamento;
    private double taxaJurosAnual;

    // Getters
    public double getValorImovel() {
        return this.valorImovel;
    }
    public double getPrazoFinanciamento() {
        return this.prazoFinanciamento;
    }
    public double getTaxaJuros() {
        return this.taxaJurosAnual;
    }

    // Construtor
    public Financiamento(double valorDesejadoImovel, double prazoFinanciamentoAnos, double taxaJurosAnual)
        {
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
        }

    // Métodos
    public double calcularPagamentoMensal(double valorImovel, double prazoFinanciamento, double taxaJurosAnual) {
        double taxaJurosMensal = taxaJurosAnual / 12;
        double quantidadePagamentos = prazoFinanciamento * 12;
        return ((valorImovel * taxaJurosMensal) /
                (1 - Math.pow(1 + taxaJurosMensal,
                -quantidadePagamentos)));
//        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    public double calcularTotalPagamento() {
        return this.calcularPagamentoMensal(valorImovel, prazoFinanciamento, taxaJurosAnual) * this.prazoFinanciamento * 12;
    }

    public void displayFinanciamento() {
        System.out.printf(
            "Valor do imóvel: %.2f reais%n" +
            "Prazo do financiamento: %f anos%n" +
            "Taxa de juros: %.2f%%%n%n" +
            "Pagamento mensal: %.2f reais%n" +
            "Valor total: %.2f reais%n",
            valorImovel, prazoFinanciamento,
            taxaJurosAnual, calcularPagamentoMensal(valorImovel, prazoFinanciamento, taxaJurosAnual),
            calcularTotalPagamento()
        );
    }

}

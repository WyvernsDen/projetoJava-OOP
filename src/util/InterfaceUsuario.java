package util;

import java.util.Locale;
import java.util.Scanner;

public class InterfaceUsuario {

    Scanner input = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

    public double inputValorImovel() {
        System.out.print("Digite o valor do imóvel em reais: ");
        double num = input.nextDouble();
        if (num > 0 && num < 1000000000.00){
//            System.out.println(num);
            return num;
        }
        else {
            System.out.println("Valor do imóvel inválido, tente novamente.");
            return inputValorImovel();
        }
    }

    public double inputPrazoFinanciamento() {
        System.out.print("Digite o prazo do financiamento em anos: ");
        double num = input.nextInt();
        if (num > 0 && num < 60) {
            return num / 100;
        }
        else {
            System.out.println("Prazo inválido, tente novamente.");
            return inputPrazoFinanciamento();
        }
    }

    public double inputTaxaJuros() {
        System.out.print("Digite o percentual da taxa de juros anual: ");
        double num = input.nextDouble();
        if (num > 0 && num < 200) {
            return num;
        }
        else {
            System.out.println("Taxa de juros inválido, tente novamente.");
            return inputTaxaJuros();
        }
    }
}

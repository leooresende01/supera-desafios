package br.com.desafio2.ui.console;

import br.com.desafio2.model.QuantidadeNotaMoeda;

import java.util.List;
import java.util.Locale;

public class ConsoleWritter {
    public void exibeNotas(List<QuantidadeNotaMoeda> quantNotas) {
        System.out.println("NOTAS:");
        quantNotas.stream().map(valorQuantidade -> String.format(Locale.US, "%d nota(s) de R$ %,.2f",
                        valorQuantidade.getQuantidadeMinima(), valorQuantidade.getValorMoedaNota()))
                .forEach(System.out::println);
    }

    public void exibeMoedas(List<QuantidadeNotaMoeda> quantMoedas) {
        System.out.println("MOEDAS:");
        quantMoedas.stream().map(valorQuantidade -> String.format(Locale.US, "%d moeda(s) de R$ %,.2f",
                        valorQuantidade.getQuantidadeMinima(), valorQuantidade.getValorMoedaNota()))
                .forEach(System.out::println);
    }

    public void exibeMensagemErro(String msg) {
        System.out.println();
        System.out.println(msg);
        System.out.println();
    }
}

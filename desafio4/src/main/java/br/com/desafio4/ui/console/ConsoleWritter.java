package br.com.desafio4.ui.console;

import java.util.List;

public class ConsoleWritter {
    public void exibeMensagemErro(String msg) {
        System.out.println();
        System.out.println(msg);
        System.out.println();
    }

    public void exibeFrases(List<String> frasesDesembaralhadas) {
        System.out.println();
        frasesDesembaralhadas.forEach(System.out::println);
    }
}

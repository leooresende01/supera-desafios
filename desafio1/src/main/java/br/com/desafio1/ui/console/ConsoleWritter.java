package br.com.desafio1.ui.console;

import java.util.List;

public class ConsoleWritter {
    public void exibeNumeros(List<Integer> numeros) {
        System.out.println();
        numeros.forEach(System.out::println);
    }

    public void exibeMensagemErro(String msg) {
        System.out.println();
        System.out.println(msg);
        System.out.println();
    }
}

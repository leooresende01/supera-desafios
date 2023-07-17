package br.com.desafio3.ui.console;

public class ConsoleWritter {
    public void exibeMensagemErro(String msg) {
        System.out.println();
        System.out.println(msg);
        System.out.println();
    }

    public void exibeResultado(Integer resultado) {
        System.out.println(resultado);
    }
}

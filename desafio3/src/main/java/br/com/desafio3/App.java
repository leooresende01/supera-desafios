package br.com.desafio3;

import br.com.desafio3.infra.util.DadosArrayUtil;
import br.com.desafio3.infra.util.providers.ScannerProvider;
import br.com.desafio3.model.DadosArray;
import br.com.desafio3.ui.console.ConsoleReader;
import br.com.desafio3.ui.console.ConsoleWritter;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ConsoleWritter consoleWritter = new ConsoleWritter();
        ConsoleReader consoleReader = new ConsoleReader(ScannerProvider.getScanner(), consoleWritter);
        DadosArray dadosArray = consoleReader.lerDadosArray();
        Integer[] elementos = consoleReader.lerElementosArray(dadosArray.getTamanho());
        Integer quantParesCriterio = DadosArrayUtil
                .pegaQuantParesCriterio(elementos, dadosArray.getValorAlvo());
        consoleWritter.exibeResultado(quantParesCriterio);
    }
}

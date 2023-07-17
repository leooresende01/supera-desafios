package br.com.desafio1;

import br.com.desafio1.infra.util.NumeroUtil;
import br.com.desafio1.infra.util.providers.ScannerProvider;
import br.com.desafio1.ui.console.ConsoleReader;
import br.com.desafio1.ui.console.ConsoleWritter;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ConsoleWritter consoleWritter = new ConsoleWritter();
        ConsoleReader consoleReader = new ConsoleReader(ScannerProvider.getScanner(), consoleWritter);
        List<Integer> numeros = consoleReader.lerNumeros();
        ArrayList<Integer> numerosOrdenados = NumeroUtil.ordenaNumerosConformeRegra(numeros);
        consoleWritter.exibeNumeros(numerosOrdenados);
        ScannerProvider.closeScanner();
    }
}

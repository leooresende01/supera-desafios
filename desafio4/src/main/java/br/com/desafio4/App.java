package br.com.desafio4;

import br.com.desafio4.infra.util.providers.FraseUtil;
import br.com.desafio4.infra.util.providers.ScannerProvider;
import br.com.desafio4.ui.console.ConsoleReader;
import br.com.desafio4.ui.console.ConsoleWritter;

import java.util.List;
public class App {
    public static void main(String[] args) {
        ConsoleWritter consoleWritter = new ConsoleWritter();
        ConsoleReader consoleReader = new ConsoleReader(ScannerProvider.getScanner(), consoleWritter);
        List<String> frasesEmbaralhadas = consoleReader.lerFrases();
        List<String> frasesDesembaralhadas = FraseUtil.desembaralhaFrases(frasesEmbaralhadas);
        consoleWritter.exibeFrases(frasesDesembaralhadas);
    }
}

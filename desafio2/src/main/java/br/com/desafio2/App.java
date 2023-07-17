package br.com.desafio2;

import br.com.desafio2.infra.util.CalculadoraUtil;
import br.com.desafio2.infra.util.provider.ScannerProvider;
import br.com.desafio2.model.Moedas;
import br.com.desafio2.model.Notas;
import br.com.desafio2.model.QuantidadeNotaMoeda;
import br.com.desafio2.ui.console.ConsoleReader;
import br.com.desafio2.ui.console.ConsoleWritter;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        ConsoleWritter consoleWritter = new ConsoleWritter();
        ConsoleReader consoleReader = new ConsoleReader(ScannerProvider.getScanner(), consoleWritter);
        BigDecimal valorInicial = consoleReader.lerValorInicial();
        List<QuantidadeNotaMoeda> quantNotaMoedas = CalculadoraUtil.pegaQuantMinima(valorInicial,
                Stream.concat(Notas.valoresNotas().stream(), Moedas.valoresMoedas().stream())
                        .collect(Collectors.toList()));
        List<QuantidadeNotaMoeda> quantMinimasNotas = Notas.pegarQuantNotas(quantNotaMoedas);
        List<QuantidadeNotaMoeda> quantMinimasMoedas = Moedas.pegarQuantMoedas(quantNotaMoedas);
        consoleWritter.exibeNotas(quantMinimasNotas);
        consoleWritter.exibeMoedas(quantMinimasMoedas);
    }
}

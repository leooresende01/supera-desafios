package br.com.desafio2.ui.console;

import br.com.desafio2.infra.exception.ValorInvalidoException;
import br.com.desafio2.infra.exception.ValorNaoFloatException;

import java.math.BigDecimal;
import java.util.Scanner;

public class ConsoleReader {
    private final Scanner scanner;
    private final ConsoleWritter consoleWritter;

    public ConsoleReader(Scanner scanner, ConsoleWritter consoleWritter) {
        this.scanner = scanner;
        this.consoleWritter = consoleWritter;
    }

    public BigDecimal lerValorInicial() {
        try {
            String entrada = scanner.nextLine();
            if (entrada.substring(entrada.lastIndexOf('.') + 1).length() != 2) {
                throw new ValorNaoFloatException();
            }
            double valorInicial = Double.parseDouble(entrada);
            if (valorInicial <= 0.0 || valorInicial >= 1000000.00) {
                throw new ValorInvalidoException();
            }
            return BigDecimal.valueOf(valorInicial);
        } catch (ValorNaoFloatException e) {
            this.consoleWritter.exibeMensagemErro("O valor deve ser um ponto flutuante com duas casas decimais");
        }
        catch (ValorInvalidoException e) {
            this.consoleWritter.exibeMensagemErro("O valor não pode ser menor que 0 e maior que 100000");
        } catch (Exception ex) {
            this.consoleWritter.exibeMensagemErro("O valor deve ser um ponto flutuante");
        }
        return this.lerValorInicial();
    }
}

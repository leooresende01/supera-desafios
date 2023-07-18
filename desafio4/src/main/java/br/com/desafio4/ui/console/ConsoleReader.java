package br.com.desafio4.ui.console;

import br.com.desafio4.infra.exception.FraseInvalidaException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader {
    private final Scanner scanner;
    private final ConsoleWritter consoleWritter;

    public ConsoleReader(Scanner scanner, ConsoleWritter consoleWritter) {
        this.scanner = scanner;
        this.consoleWritter = consoleWritter;
    }

    public List<String> lerFrases() {
        List<String> frases = new ArrayList<>();
        int quantidadeDeFrases = this.lerQuantidadeFrases();
        while (frases.size() < quantidadeDeFrases) {
            frases.add(this.lerProximaFrase());
        }
        return frases;
    }

    private String lerProximaFrase() {
        try {
            String frase = this.scanner.nextLine();
            if (frase.length() < 2 || frase.length() > 100) {
                throw new FraseInvalidaException();
            }
            return frase;
        } catch (FraseInvalidaException ex) {
            this.consoleWritter.exibeMensagemErro("A frase deve ter entre 2 e 100 caracteres");
        } catch (Exception ex) {
            this.consoleWritter.exibeMensagemErro("A frase é invalida");
        }
        return this.lerProximaFrase();
    }

    private Integer lerQuantidadeFrases() {
        try {
            return Integer.valueOf(this.scanner.nextLine());
        } catch (Exception ex) {
            this.consoleWritter.exibeMensagemErro("A quantidade de frases informada não é um numero inteiro valido");
        }
        return this.lerQuantidadeFrases();
    }
}

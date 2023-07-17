package br.com.desafio1.ui.console;

import br.com.desafio1.infra.exception.NumeroNegativoException;
import br.com.desafio1.infra.exception.QuantidadeNumerosInvalidaException;
import br.com.desafio1.infra.util.NumeroUtil;

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

    public List<Integer> lerNumeros() {
        List<Integer> numeros = new ArrayList<>();
        int quantidadeDeNumeros = this.lerQuantidadeNumeros();
        while (numeros.size() < quantidadeDeNumeros) {
            numeros.add(this.lerProximoNumero());
        }
        return numeros;
    }

    private Integer lerProximoNumero() {
        try {
            Integer numero = Integer.valueOf(this.scanner.nextLine());
            if (!NumeroUtil.numeroEhPositivo(numero)) {
                throw new NumeroNegativoException();
            }
            return numero;
        } catch (NumeroNegativoException ex) {
            this.consoleWritter.exibeMensagemErro("O numero não pode ser negativo");
        } catch (Exception ex) {
            this.consoleWritter.exibeMensagemErro("O ultimo numero informado não é um inteiro valido");
        }
        return this.lerProximoNumero();
    }

    private Integer lerQuantidadeNumeros() {
        try {
            Integer quantidade = Integer.valueOf(this.scanner.nextLine());
            if (quantidade.compareTo(1) <= 0 || quantidade.compareTo(100000) > 0) {
                throw new QuantidadeNumerosInvalidaException();
            }
            return quantidade;
        } catch (QuantidadeNumerosInvalidaException ex) {
            this.consoleWritter.exibeMensagemErro("O numero informado é menor que 2 ou maior que 99999");
        } catch (Exception ex) {
            this.consoleWritter.exibeMensagemErro("A quantidade de numeros informada não é um numero inteiro valido");
        }
        return this.lerQuantidadeNumeros();
    }
}

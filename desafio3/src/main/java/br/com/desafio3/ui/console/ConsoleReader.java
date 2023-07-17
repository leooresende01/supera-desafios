package br.com.desafio3.ui.console;

import br.com.desafio3.infra.exception.DadosArraysInvalidosException;
import br.com.desafio3.infra.exception.QuantidadeElementosInvalidaException;
import br.com.desafio3.model.DadosArray;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConsoleReader {

    private final Scanner scanner;
    private final ConsoleWritter consoleWritter;

    public ConsoleReader(Scanner scanner, ConsoleWritter consoleWritter) {
        this.scanner = scanner;
        this.consoleWritter = consoleWritter;
    }

    public DadosArray lerDadosArray() {
        try {
            String[] dadosArray = this.scanner.nextLine().split(" ");
            if (dadosArray.length != 2) {
                throw new DadosArraysInvalidosException();
            }
            Integer tamanhoArray = Integer.valueOf(dadosArray[0]);
            Integer valorAlvo = Integer.valueOf(dadosArray[1]);
            return new DadosArray(tamanhoArray, valorAlvo);
        } catch (DadosArraysInvalidosException ex) {
            this.consoleWritter.exibeMensagemErro("Deve ser informado apenas o tamanho do array e o valor alvo");
        } catch (Exception ex) {
            this.consoleWritter.exibeMensagemErro("O tamanho do array e o valor alvo informados são invalidos");
        }
        return this.lerDadosArray();
    }

    public Integer[] lerElementosArray(Integer tamanhoArray) {
        try {
            List<Integer> elemList = Arrays.stream(this.scanner.nextLine().split(" ")).map(Integer::valueOf)
                    .collect(Collectors.toList());
            if (elemList.size() != tamanhoArray) {
                throw new QuantidadeElementosInvalidaException();
            }
            return elemList.toArray(new Integer[tamanhoArray]);
        } catch (QuantidadeElementosInvalidaException e) {
            this.consoleWritter.exibeMensagemErro(String
                    .format("Deve ser informado %d elementos pro array", tamanhoArray));
        } catch (Exception ex) {
            this.consoleWritter.exibeMensagemErro("Os elementos do array são invalidos");
        }
        return this.lerElementosArray(tamanhoArray);
    }
}

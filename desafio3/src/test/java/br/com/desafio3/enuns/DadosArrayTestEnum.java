package br.com.desafio3.enuns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum DadosArrayTestEnum {
    RESULTADO1(Arrays.asList(1, 2, 3, 4, 5), 2, 3),
    RESULTADO2(Arrays.asList(3, 6, 9, 12, 15), 3, 4),
    RESULTADO3(Arrays.asList(3, 6, 9, 12, 15), 4, 0),
    RESULTADO4(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), 3, 6),
    RESULTADO5(Arrays.asList(10, 3, 2, 1, 12, 11, 5, 8, 7, 6, 4, 9), 5, 7);

    private final Integer[] elementos;
    private final Integer resultadoEsperado;
    private final Integer valorAlvo;

    DadosArrayTestEnum(List<Integer> elementos, Integer valorAlvo, Integer resultadoEsperado) {
        this.resultadoEsperado = resultadoEsperado;
        this.valorAlvo = valorAlvo;
        this.elementos = elementos.toArray(new Integer[0]);
    }

    public static List<DadosArrayTestEnum> valores() {
        return new ArrayList<>(Arrays.asList(DadosArrayTestEnum.values()));
    }

    public Integer[] getElementos() {
        return this.elementos;
    }

    public Integer getValorAlvo() {
        return this.valorAlvo;
    }

    public Integer getResultadoEsperado() {
        return this.resultadoEsperado;
    }
}

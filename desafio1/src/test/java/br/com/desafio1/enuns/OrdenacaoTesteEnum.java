package br.com.desafio1.enuns;

import java.util.Arrays;
import java.util.List;

public enum OrdenacaoTesteEnum {
    ORDENACAO1(Arrays.asList(2, 0, 4, 5, 220, 3272, 942, 12, 345, 1200),
            Arrays.asList(0, 2, 4, 12, 220, 942, 1200, 3272, 345, 5)),
    ORDENACAO2(Arrays.asList(75, 25, 1435, 20, 900, 430, 1989, 745, 923, 10),
                Arrays.asList(10, 20, 430, 900, 1989, 1435, 923, 745, 75, 25)),
    ORDENACAO3(Arrays.asList(4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98),
            Arrays.asList(4, 32, 34, 98, 654, 3456, 6789, 567, 543, 87)),
    ORDENACAO4(Arrays.asList(72636, 65834, 93883, 86631, 83723, 21332, 56721, 42311, 43258, 92183),
            Arrays.asList(21332, 43258, 65834, 72636, 93883, 92183, 86631, 83723, 56721, 42311));
    private final List<Integer> numeros;
    private final List<Integer> ordenacaoEsperada;

    OrdenacaoTesteEnum(List<Integer> numeros, List<Integer> ordenacaoEsperada) {
        this.numeros = numeros;
        this.ordenacaoEsperada = ordenacaoEsperada;
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public List<Integer> getOrdenacaoEsperada() {
        return ordenacaoEsperada;
    }

    public static List<OrdenacaoTesteEnum> pegaValoresComoLista() {
        return Arrays.asList(OrdenacaoTesteEnum.values());
    }
}

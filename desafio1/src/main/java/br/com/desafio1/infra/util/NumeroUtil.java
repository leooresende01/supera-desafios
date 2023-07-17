package br.com.desafio1.infra.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumeroUtil {
    public static boolean numeroEhImpar(Integer numero) {
        return numero % 2 != 0;
    }

    public static boolean numeroEhPar(Integer numero) {
        return !NumeroUtil.numeroEhImpar(numero);
    }

    public static boolean todosSaoImpares(Integer ...numeros) {
        return Arrays.stream(numeros).allMatch(NumeroUtil::numeroEhImpar);
    }

    public static boolean todosSaoPares(Integer ...numeros) {
        return Arrays.stream(numeros).allMatch(NumeroUtil::numeroEhPar);
    }

    public static boolean numeroEhPositivo(Integer numero) {
        return numero >= 0;
    }

    public static ArrayList<Integer> ordenaNumerosConformeRegra(List<Integer> numeros) {
        ArrayList<Integer> numerosSort = new ArrayList<>(numeros);
        numerosSort.sort((o1, o2) -> {
            if (NumeroUtil.numeroEhPar(o1) && NumeroUtil.numeroEhImpar(o2)) {
                return -1;
            } else if (NumeroUtil.numeroEhPar(o2) && NumeroUtil.numeroEhImpar(o1)) {
                return 1;
            } else if (NumeroUtil.todosSaoImpares(o1, o2)) {
                return o2.compareTo(o1);
            } else if (NumeroUtil.todosSaoPares(o1, o2)) {
                return o1.compareTo(o2);
            } throw new RuntimeException();
        });
        return numerosSort;
    }

}

package br.com.desafio4.infra.util.providers;

import java.util.List;
import java.util.stream.Collectors;

public class FraseUtil {
    public static List<String> desembaralhaFrases(List<String> frases) {
        return frases.stream().map(FraseUtil::desembaralhaFrase).collect(Collectors.toList());
    }

    public static String desembaralhaFrase(String frase) {
        Integer posicaoMetadeFrase = Integer.divideUnsigned(frase.length(), 2);
        String parte1Frase = FraseUtil.reverteString(frase.substring(0, posicaoMetadeFrase));
        String parte2Frase = FraseUtil.reverteString(frase.substring(posicaoMetadeFrase));
        return parte1Frase + parte2Frase;
    }

    private static String reverteString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

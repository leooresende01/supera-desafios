package br.com.desafio3.infra.util;

public class DadosArrayUtil {
    public static Integer pegaQuantParesCriterio(Integer[] elementos, Integer valorAlvo) {
        Integer quantParesValidos = 0;
        for(Integer el: elementos) {
            for (Integer subEl: elementos) {
                int valorSub = el - subEl;
                if (valorSub == valorAlvo) {
                    quantParesValidos++;
                }
            }
        }
        return quantParesValidos;
    }
}

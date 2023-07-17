package br.com.desafio2.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Notas {
    CEM("100"),
    CINQUENTA("50"),
    VINTE("20"),
    DEZ("10"),
    CINCO("5"),
    DOIS("2");

    private final BigDecimal nota;

    Notas(String nota) {
        this.nota = new BigDecimal(nota);
    }


    public static Boolean notaExiste(BigDecimal valorNota) {
        return Notas.valores().stream().anyMatch(notas -> notas.getValor()
                .equals(valorNota));
    }

    public static List<QuantidadeNotaMoeda> pegarQuantNotas(List<QuantidadeNotaMoeda> quantidadeNotaMoedas) {
        return quantidadeNotaMoedas.stream().filter(valorQuantidade ->
                Notas.notaExiste(valorQuantidade.getValorMoedaNota())).collect(Collectors.toList());
    }

    public BigDecimal getValor() {
        return this.nota;
    }

    public static List<Notas> valores() {
        return new ArrayList<>(Arrays.asList(Notas.values()));
    }

    public static List<BigDecimal> valoresNotas() {
        return Arrays.stream(Notas.values())
                .map(Notas::getValor).collect(Collectors.toList());
    }
}

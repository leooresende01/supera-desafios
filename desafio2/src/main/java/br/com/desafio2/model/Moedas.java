package br.com.desafio2.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Moedas {
    UM_REAL("1"),
    CINQUENTA_CENTAVOS("0.50"),
    VINTE_CINCO_CENTAVOS("0.25"),
    DEZ_CENTAVOS("0.10"),
    CINCO_CENTAVOS("0.05"),
    UM_CENTAVO("0.01");

    private final BigDecimal moeda;

    Moedas(String moeda) {
        this.moeda = new BigDecimal(moeda);
    }

    public BigDecimal getValor() {
        return this.moeda;
    }

    public static List<Moedas> valores() {
        return new ArrayList<>(Arrays.asList(Moedas.values()));
    }

    public static Boolean moedaExiste(BigDecimal valorMoeda) {
        return Moedas.valores().stream().anyMatch(notas -> notas.getValor()
                .equals(valorMoeda));
    }

    public static List<QuantidadeNotaMoeda> pegarQuantMoedas(List<QuantidadeNotaMoeda> quantidadeNotaMoedas) {
        return quantidadeNotaMoedas.stream().filter(valorQuantidade ->
                Moedas.moedaExiste(valorQuantidade.getValorMoedaNota())).collect(Collectors.toList());
    }
    public static List<BigDecimal> valoresMoedas() {
        return Arrays.stream(Moedas.values())
                .map(Moedas::getValor).collect(Collectors.toList());
    }
}

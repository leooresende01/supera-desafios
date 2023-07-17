package br.com.desafio2.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class QuantidadeNotaMoeda {
    private final BigDecimal valorMoedaNota;
    private Integer quantidadeMinima;

    public QuantidadeNotaMoeda(BigDecimal valorMoedaNota) {
        this.valorMoedaNota = valorMoedaNota;
    }

    public QuantidadeNotaMoeda(BigDecimal valorMoedaNota, Integer quantidadeMinima) {
        this.valorMoedaNota = valorMoedaNota;
        this.quantidadeMinima = quantidadeMinima;
    }

    public Integer getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public BigDecimal getValorMoedaNota() {
        return valorMoedaNota;
    }

    public void calculaQuantidadeMinima(BigDecimal valorRestante) {
        this.quantidadeMinima = valorRestante.divide(this.valorMoedaNota, RoundingMode.HALF_DOWN)
                .setScale(0, RoundingMode.DOWN).intValue();
    }

    @Override
    public boolean equals(Object obj) {
        try {
            QuantidadeNotaMoeda qnm = (QuantidadeNotaMoeda) obj;
            return this.quantidadeMinima.equals(qnm.quantidadeMinima) &&
                    this.valorMoedaNota.equals(qnm.valorMoedaNota);
        } catch (Exception ex) {
            return super.equals(obj);
        }
    }

    @Override
    public int hashCode() {
        return this.valorMoedaNota.hashCode() + this.quantidadeMinima.hashCode();
    }

    @Override
    public String toString() {
        return String.format("{valor: %s, quantidade: %s}", this.valorMoedaNota, this.quantidadeMinima);
    }
}

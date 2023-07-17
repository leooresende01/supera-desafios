package br.com.desafio3.model;

public class DadosArray {
    private final Integer tamanho;
    private final Integer valorAlvo;

    public DadosArray(Integer tamanho, Integer valorAlvo) {
        this.tamanho = tamanho;
        this.valorAlvo = valorAlvo;
    }

    public Integer getTamanho() {
        return this.tamanho;
    }

    public Integer getValorAlvo() {
        return this.valorAlvo;
    }

    @Override
    public String toString() {
        return "DadosArray{" +
                "tamanho=" + tamanho +
                ", valorAlvo=" + valorAlvo +
                '}';
    }
}

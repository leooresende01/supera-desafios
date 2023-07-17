package br.com.desafio2.enuns;

import br.com.desafio2.model.Moedas;
import br.com.desafio2.model.Notas;
import br.com.desafio2.model.QuantidadeNotaMoeda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum NotasMoedasTesteEnum {
    VALORES1("203.20", Arrays.asList(
            criaQuantNM(Notas.CEM.getValor(), 2),
            criaQuantNM(Notas.DOIS.getValor(), 1),
            criaQuantNM(Moedas.UM_REAL.getValor(), 1),
            criaQuantNM(Moedas.DEZ_CENTAVOS.getValor(), 2)
    )),
    VALORES2("576.73", Arrays.asList(
            criaQuantNM(Notas.CEM.getValor(), 5),
            criaQuantNM(Notas.CINQUENTA.getValor(), 1),
            criaQuantNM(Notas.VINTE.getValor(), 1),
            criaQuantNM(Notas.CINCO.getValor(), 1),
            criaQuantNM(Moedas.UM_REAL.getValor(), 1),
            criaQuantNM(Moedas.CINQUENTA_CENTAVOS.getValor(), 1),
            criaQuantNM(Moedas.DEZ_CENTAVOS.getValor(), 2),
            criaQuantNM(Moedas.UM_CENTAVO.getValor(), 3)
    )),
    VALORES3("221.23", Arrays.asList(
            criaQuantNM(Notas.CEM.getValor(), 2),
            criaQuantNM(Notas.VINTE.getValor(), 1),
            criaQuantNM(Moedas.UM_REAL.getValor(), 1),
            criaQuantNM(Moedas.DEZ_CENTAVOS.getValor(), 2),
            criaQuantNM(Moedas.UM_CENTAVO.getValor(), 3)
            )),
    VALORES4("72472.45", Arrays.asList(
            criaQuantNM(Notas.CEM.getValor(), 724),
            criaQuantNM(Notas.CINQUENTA.getValor(), 1),
            criaQuantNM(Notas.VINTE.getValor(), 1),
            criaQuantNM(Notas.DOIS.getValor(), 1),
            criaQuantNM(Moedas.VINTE_CINCO_CENTAVOS.getValor(), 1),
            criaQuantNM(Moedas.DEZ_CENTAVOS.getValor(), 2)
    ));

    private final BigDecimal valorInicial;
    private final List<QuantidadeNotaMoeda> quantidadeNotasMoedas;

    NotasMoedasTesteEnum(String valorInicial, List<QuantidadeNotaMoeda> quantidadeNotasMoedas) {
        this.valorInicial = new BigDecimal(valorInicial);
        this.quantidadeNotasMoedas = quantidadeNotasMoedas;
    }

    private static QuantidadeNotaMoeda criaQuantNM(BigDecimal valor, Integer quantidade) {
        return new QuantidadeNotaMoeda(valor, quantidade);
    }

    public static List<NotasMoedasTesteEnum> valores() {
        return new ArrayList<>(Arrays.asList(NotasMoedasTesteEnum.values()));
    }

    public BigDecimal getValorInicial() {
        return valorInicial;
    }

    public List<QuantidadeNotaMoeda> getQuantidadeNotasMoedas() {
        return quantidadeNotasMoedas;
    }
}

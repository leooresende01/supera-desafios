package br.com.desafio2.infra.util;

import br.com.desafio2.model.QuantidadeNotaMoeda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraUtil {
    public static List<QuantidadeNotaMoeda> pegaQuantMinima(BigDecimal valorInicial, List<BigDecimal> valoresNotasMoedas) {
        ArrayList<QuantidadeNotaMoeda> valoresQuantidades = new ArrayList<>();
        for (BigDecimal valor: valoresNotasMoedas) {
            QuantidadeNotaMoeda quantNotaMoeda = new QuantidadeNotaMoeda(valor);
            quantNotaMoeda.calculaQuantidadeMinima(valorInicial);
            if (quantNotaMoeda.getQuantidadeMinima() > 0) {
                valorInicial = valorInicial
                        .subtract(valor.multiply(new BigDecimal(quantNotaMoeda.getQuantidadeMinima())));
            }
            valoresQuantidades.add(quantNotaMoeda);
        }
        return valoresQuantidades;
    }
}

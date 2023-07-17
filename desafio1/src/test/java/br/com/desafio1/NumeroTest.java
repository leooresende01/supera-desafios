package br.com.desafio1;

import br.com.desafio1.enuns.OrdenacaoTesteEnum;
import br.com.desafio1.infra.util.NumeroUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class NumeroTest {

    @Test
    public void deveriaOrdenarNumerosCorretamente() {
        OrdenacaoTesteEnum.pegaValoresComoLista().forEach(ordenacaoTesteEnum -> {
            List<Integer> numerosOrdenados = NumeroUtil.ordenaNumerosConformeRegra(ordenacaoTesteEnum.getNumeros());
            Assert.assertEquals(numerosOrdenados, ordenacaoTesteEnum.getOrdenacaoEsperada());
        });
    }

    @Test
    public void testarClassesUtilitarias() {
        this.condicoesSaoVerdadeiras(
                NumeroUtil.numeroEhImpar(1),
                NumeroUtil.todosSaoImpares(1, 3, 5, 9, 1591),
                NumeroUtil.numeroEhPositivo(10),
                NumeroUtil.todosSaoPares(2, 4, 6, 8, 1002)
        );
        this.condicoesSaoFalsas(
                NumeroUtil.numeroEhImpar(2),
                NumeroUtil.todosSaoImpares(1, 4, 5, 8, 1591),
                NumeroUtil.numeroEhPositivo(-5),
                NumeroUtil.todosSaoPares(1, 50, 6, 8, 1002)
        );
    }

    private void condicoesSaoVerdadeiras(Boolean ...condicoes) {
        Arrays.stream(condicoes).forEach(Assert::assertTrue);
    }

    private void condicoesSaoFalsas(Boolean ...condicoes) {
        Arrays.stream(condicoes).forEach(Assert::assertFalse);
    }
}

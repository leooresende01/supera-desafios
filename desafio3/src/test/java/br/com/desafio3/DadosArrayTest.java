package br.com.desafio3;

import br.com.desafio3.enuns.DadosArrayTestEnum;
import br.com.desafio3.infra.util.DadosArrayUtil;
import org.junit.Assert;
import org.junit.Test;

public class DadosArrayTest {
    @Test
    public void deveriaPegarOResultadoCorretamente() {
        DadosArrayTestEnum.valores()
                .forEach(dadosEnum -> {
                    Integer resultado = DadosArrayUtil
                            .pegaQuantParesCriterio(dadosEnum.getElementos(), dadosEnum.getValorAlvo());
                    Assert.assertEquals(dadosEnum.getResultadoEsperado(), resultado);
                });
    }
}

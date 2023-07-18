package br.com.desafio4;

import br.com.desafio4.enuns.FrasesTestsValues;
import br.com.desafio4.infra.util.providers.FraseUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FrasesTest {
    @Test
    public void deveriaDesembaralharAsFrasesCorretamente() {
        FrasesTestsValues.valores().forEach(ftv -> {
            String fraseDesembaralhada = FraseUtil.desembaralhaFrase(ftv.getFraseEmbaralhada());
            Assert.assertEquals(ftv.getFraseDesembaralhada(), fraseDesembaralhada);
        });
    }
}

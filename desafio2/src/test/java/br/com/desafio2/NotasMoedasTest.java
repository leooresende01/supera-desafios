package br.com.desafio2;

import br.com.desafio2.enuns.NotasMoedasTesteEnum;
import br.com.desafio2.infra.util.CalculadoraUtil;
import br.com.desafio2.model.Moedas;
import br.com.desafio2.model.Notas;
import br.com.desafio2.model.QuantidadeNotaMoeda;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;

public class NotasMoedasTest {
    
    @Test
    public void deveriaPegarAsQuantidadesDeCadaMoedaNormalmente() {
        NotasMoedasTesteEnum.valores().forEach(nmTesteEnum -> {
            BigDecimal valorInicial = nmTesteEnum.getValorInicial();
            List<QuantidadeNotaMoeda> quantNotaMoedas = CalculadoraUtil.pegaQuantMinima(valorInicial,
                    Stream.concat(Notas.valoresNotas().stream(), Moedas.valoresMoedas().stream())
                            .collect(Collectors.toList()));
            List<QuantidadeNotaMoeda> nmAlvo = quantNotaMoedas.stream()
                    .filter(qnm -> qnm.getQuantidadeMinima() != 0)
                    .collect(Collectors.toList());
            Assert.assertEquals(nmTesteEnum.getQuantidadeNotasMoedas(), nmAlvo);
        });
    }
}

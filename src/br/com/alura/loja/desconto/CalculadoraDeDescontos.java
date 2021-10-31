package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDe5Itens(
                new DescontoParaOrcamentoComValorMaiorQue500(
                        new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}


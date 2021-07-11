package com.wagnerrmorais.loja.desconto;

import com.wagnerrmorais.loja.orcamento.Orcamento;

import java.math.BigDecimal;
//exemplo chain of responsabilities
public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()
                )
        );

        return cadeiaDeDescontos.calcular(orcamento);
    }
}

package com.wagnerrmorais.loja.imposto;

import com.wagnerrmorais.loja.orcamento.Orcamento;

import java.math.BigDecimal;

//Strategy example
public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}

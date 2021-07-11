package com.wagnerrmorais.loja.imposto;

import com.wagnerrmorais.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto{

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.6"));
    }
}

package com.wagnerrmorais.loja.imposto;

import com.wagnerrmorais.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}

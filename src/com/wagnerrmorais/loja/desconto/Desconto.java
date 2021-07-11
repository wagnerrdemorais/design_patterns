package com.wagnerrmorais.loja.desconto;

import com.wagnerrmorais.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    //exemplo template method
    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return this.efetuarCalculo(orcamento);
        }
        return proximo.efetuarCalculo(orcamento);
    }

    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public abstract boolean deveAplicar(Orcamento orcamento);
}

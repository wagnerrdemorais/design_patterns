package com.wagnerrmorais.loja.orcamento;

import java.math.BigDecimal;

//proxy example
public class OrcamentoProxy implements Orcavel {

    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if(valor == null){
            this.valor = orcamento.getValor();
        }
        return this.valor;
    }
}

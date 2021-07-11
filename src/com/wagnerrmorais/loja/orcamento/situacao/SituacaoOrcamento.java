package com.wagnerrmorais.loja.orcamento.situacao;

import com.wagnerrmorais.loja.DomainException;
import com.wagnerrmorais.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser finalizado");
    }
}

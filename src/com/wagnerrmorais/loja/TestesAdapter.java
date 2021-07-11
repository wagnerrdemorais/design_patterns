package com.wagnerrmorais.loja;

import com.wagnerrmorais.loja.http.JavaHttpClient;
import com.wagnerrmorais.loja.orcamento.ItemOrcamento;
import com.wagnerrmorais.loja.orcamento.Orcamento;
import com.wagnerrmorais.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

//Adapter example
public class TestesAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("10")));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}

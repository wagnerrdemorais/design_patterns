package com.wagnerrmorais.loja;

import com.wagnerrmorais.loja.imposto.CalculadoraDeImpostos;
import com.wagnerrmorais.loja.imposto.ICMS;
import com.wagnerrmorais.loja.imposto.ISS;
import com.wagnerrmorais.loja.orcamento.ItemOrcamento;
import com.wagnerrmorais.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
